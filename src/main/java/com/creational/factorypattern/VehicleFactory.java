package com.creational.factorypattern;

public abstract class VehicleFactory {
    public Vehicle create() {
        Vehicle vehicle = createVehicle();
        vehicle.build();
        return vehicle;
    }

    protected abstract Vehicle createVehicle();
}
