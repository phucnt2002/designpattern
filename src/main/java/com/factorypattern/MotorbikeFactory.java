package com.factorypattern;

public class MotorbikeFactory extends VehicleFactory{
    @Override
    protected Vehicle createVehicle() {
        return new Motorbike();
    }
}
