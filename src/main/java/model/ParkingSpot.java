package model;

import model.enums.SpotStatus;
import model.enums.VehicleType;

import java.util.UUID;

public class ParkingSpot {
    private String spotId;
    private SpotStatus spotStatus;
    private VehicleType vehicleType;

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpot(SpotStatus spotStatus, VehicleType vehicleType) {
        this.spotId= UUID.randomUUID().toString();
        this.spotStatus = spotStatus;
        this.vehicleType = vehicleType;
    }
}
