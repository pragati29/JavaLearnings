package org.example.oopsConcepts.abstraction;

public class Car extends Vehicle{
    int numberOfDoors;
    public Car(String brand, String model, int year,int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors=numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Starting the " + brand + " " + model + " with " + numberOfDoors + " doors.");
    }
}
