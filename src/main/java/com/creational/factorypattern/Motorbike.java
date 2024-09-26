package com.creational.factorypattern;

public class Motorbike implements Vehicle{
    @Override
    public void build() {
        System.out.println("Build Motorbike");
    }
}
