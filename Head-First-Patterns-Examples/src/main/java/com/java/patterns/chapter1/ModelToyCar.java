package com.java.patterns.chapter1;

public class ModelToyCar extends Vehicle{

    public ModelToyCar(String make, String model, int year, int minSpeed, int maxSpeed) {
        super(make, model, year, minSpeed, maxSpeed,new NovaDrive(), new NoHonk());
    }
}
