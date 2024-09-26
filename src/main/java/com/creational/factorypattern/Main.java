package com.creational.factorypattern;


public class Main {
    public static void main(String[] args) {
        VehicleFactory motorbikeFactory = new MotorbikeFactory();
        Vehicle motorbike = motorbikeFactory.create();

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.create();
    }
}