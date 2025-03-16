package model;

import model.enums.VehicleType;

public class Vehicle {
    private String licencePlate;
    private VehicleType vehicleType;

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle(String licencePlate, VehicleType vehicleType) {
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }
}
