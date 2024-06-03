package com.java.patterns.chapter1;

public class Truck extends Vehicle{
    public Truck(String make, String model, int year, int minSpeed, int maxSpeed) {
        super(make, model, year, minSpeed, maxSpeed, new DriveImpl(), new HonkLoudly());
    }
}
