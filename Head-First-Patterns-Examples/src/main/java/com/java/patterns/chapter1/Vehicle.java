package com.java.patterns.chapter1;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected int minSpeed;
    protected int maxSpeed;

    private DriveBehavior driveBehavior;
    private HonkBehavior honkBehavior;

    public Vehicle(String make, String model, int year, int minSpeed, int maxSpeed, DriveBehavior driveBehavior, HonkBehavior honkBehavior) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.driveBehavior = driveBehavior;
        this.honkBehavior = honkBehavior;
    }

    public void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Minimum Speed: " + minSpeed);
        System.out.println("Maximum Speed: " + maxSpeed);
    }

    public String performDrive() {
        driveBehavior.drive().ifPresent(System.out::println);
        return driveBehavior.drive().orElse(null);
    }

    public String performHonk() {
        honkBehavior.honk().ifPresent(System.out::println);
        return honkBehavior.honk().orElse(null);
    }




}
