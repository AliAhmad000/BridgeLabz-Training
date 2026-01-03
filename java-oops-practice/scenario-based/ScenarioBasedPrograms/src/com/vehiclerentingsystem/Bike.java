package com.vehiclerentingsystem;

public class Bike extends Vehicle {

    public Bike(String id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

    public double calculateRent(int days) {
        return baseRate * days; // simple pricing
    }

    public void displayInfo() {
        System.out.println("Bike: " + brand + ", Rate/day: " + baseRate);
    }
}