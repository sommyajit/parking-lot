package model;

import model.enums.VehicleType;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ParkingLot {
    List<ParkingFloor> parkingFloors;
    Map<String, Ticket> parkingTicket;


    public ParkingLot(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public Ticket createTicket(Vehicle vehicle){
        for(ParkingFloor parkingFloor: parkingFloors){
            Optional<ParkingSpot> parkingSpot= parkingFloor.getParkingSpot(vehicle.getVehicleType());
            if(parkingSpot.isPresent()){
                Ticket ticket=new Ticket();
                ticket.generateTicket(vehicle, parkingSpot.get());
                parkingTicket.put(vehicle.getLicencePlate(), ticket);
                return ticket;
            }
        }
        return null;
    }

    public void exit(Vehicle vehicle){
        if(!parkingTicket.containsKey(vehicle.getLicencePlate())){
            System.out.println("Vehicle not parked");
            return;
        }
        parkingTicket.get(vehicle.getLicencePlate()).calculateAmount();
        parkingTicket.remove(vehicle.getLicencePlate());
    }
}
