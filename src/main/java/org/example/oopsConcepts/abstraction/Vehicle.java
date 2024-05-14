package org.example.oopsConcepts.abstraction;

import java.io.Serializable;

public abstract class Vehicle {
     String brand;
     String model;
     int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public abstract void start();

    // Non-abstract method
    public void stop() {
        System.out.println("The " + brand + " " + model + " has stopped.");
    }

    // Non-abstract method
    public void accelerate(int speed) {
        System.out.println("The " + brand + " " + model + " is accelerating at " + speed + " km/h.");
    }
}
