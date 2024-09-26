package com.structural.facade;

public class SellerVehicle {
    private Vehicle motorbike;
    private Vehicle car;

    public SellerVehicle() {
        motorbike = new MotorbikeVehicle();
        car = new CarVehicle();
    }
    public void getMachineMotor(){
        motorbike.getMachine();
    }
    public void getMachineCar(){
        car.getMachine();
    }
}
