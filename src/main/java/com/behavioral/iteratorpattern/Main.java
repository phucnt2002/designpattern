package com.behavioral.iteratorpattern;



public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Iterator vehicleIterator = vehicle.getIterator();
        while(vehicleIterator.hasNext()){
            System.out.println(vehicleIterator.next());
        }
    }
}