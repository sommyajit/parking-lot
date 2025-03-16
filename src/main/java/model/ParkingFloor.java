package model;

import model.enums.VehicleType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ParkingFloor {
    private String floorId;
    private List<ParkingSpot> parkingSpots;

    public ParkingFloor(Integer floorId, List<ParkingSpot> parkingSpots) {
        this.floorId = UUID.randomUUID().toString();
        this.parkingSpots = parkingSpots;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public Optional<ParkingSpot> getParkingSpot(VehicleType vehicleType){
        return parkingSpots.stream().filter(parkingSpot -> parkingSpot.getVehicleType().equals(vehicleType)).findFirst();
    }
}
