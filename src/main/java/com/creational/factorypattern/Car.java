package com.creational.factorypattern;

public class Car implements Vehicle{
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
