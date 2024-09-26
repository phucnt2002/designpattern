package com.creational.factorypattern;

public class MotorbikeFactory extends VehicleFactory{
    @Override
    protected Vehicle createVehicle() {
        return new Motorbike();
    }
}
