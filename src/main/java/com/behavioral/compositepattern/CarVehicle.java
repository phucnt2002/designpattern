package com.behavioral.compositepattern;

public class CarVehicle implements Vehicle {
    private String title;

    CarVehicle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("CarVehicle: " + title);
    }
}
