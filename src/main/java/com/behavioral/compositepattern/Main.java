package com.behavioral.compositepattern;



public class Main {
    public static void main(String[] args) {
        ListVehicle listVehicle = new ListVehicle("List vehicle");
        Vehicle vehicle = new CarVehicle("CarVehicle");
        Vehicle vehicle1 = new CarVehicle("CarVehicle1");

        listVehicle.addVehicle(vehicle);
        listVehicle.addVehicle(vehicle1);
        listVehicle.display();

    }
}