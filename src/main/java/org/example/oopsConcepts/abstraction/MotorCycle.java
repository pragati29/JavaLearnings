package org.example.oopsConcepts.abstraction;

public class MotorCycle extends Vehicle{
    private String type;

    public MotorCycle(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type=type;
    }

    @Override
    public void start() {

    }
}
