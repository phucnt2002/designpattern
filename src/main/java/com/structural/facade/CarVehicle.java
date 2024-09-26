package com.structural.facade;

public class CarVehicle implements Vehicle{
    @Override
    public void getMachine() {
        System.out.println("CarVehicle::getMachine()");
    }
}
