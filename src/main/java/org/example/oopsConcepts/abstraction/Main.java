package org.example.oopsConcepts.abstraction;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.start();
        car.accelerate(60);
        car.stop();

        MotorCycle motorcycle = new MotorCycle("Harley-Davidson", "Sportster", 2021, "Cruiser");
        motorcycle.start();
        motorcycle.accelerate(80);
        motorcycle.stop();
    }
}
