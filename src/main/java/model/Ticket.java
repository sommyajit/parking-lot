package model;

import model.enums.SpotStatus;
import model.enums.VehicleType;

import java.time.Duration;
import java.time.LocalTime;

public class Ticket {
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalTime entryTime;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalTime entryTime) {
        this.entryTime = entryTime;
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        this.setEntryTime(LocalTime.now());
        this.setVehicle(vehicle);
        parkingSpot.setSpotStatus(SpotStatus.FILLED);
        this.setParkingSpot(parkingSpot);
        return this;
    }

    public void calculateAmount(){
        LocalTime exitTime = LocalTime.now(); // Capture exit time
        long durationMinutes = Duration.between(entryTime, exitTime).toMinutes();
        parkingSpot.setSpotStatus(SpotStatus.EMPTY);
        System.out.println("Amount to be paid"+ (durationMinutes)*100);

    }

}
