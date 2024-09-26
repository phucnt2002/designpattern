package com.behavioral.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class ListVehicle implements Vehicle {
    private String title;
    private List<Vehicle> vehicles;

    public ListVehicle(String title) {
        this.title = title;
        vehicles = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    @Override
    public void display() {
        System.out.println("Task List: " + title);
        for (Vehicle vehicle : vehicles) {
            vehicle.display();
        }
    }
}
