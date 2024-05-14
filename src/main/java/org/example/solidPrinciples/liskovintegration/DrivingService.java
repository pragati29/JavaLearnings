package org.example.solidPrinciples.liskovintegration;

public class DrivingService {
    void startVehicle(Vehicle vehicle){
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        DrivingService drivingService = new DrivingService();
        Vehicle veh = new Truck();
        drivingService.startVehicle(veh);
    }
}
