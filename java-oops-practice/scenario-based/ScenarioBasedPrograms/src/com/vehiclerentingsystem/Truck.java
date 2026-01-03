package com.vehiclerentingsystem;

public class Truck extends Vehicle {
    private double loadSurcharge;

    public Truck(String id, String brand, double baseRate, double loadSurcharge) {
        super(id, brand, baseRate);
        this.loadSurcharge = loadSurcharge;
    }

    public double calculateRent(int days) {
        return (baseRate * days) + loadSurcharge;
    }

    public void displayInfo() {
        System.out.println("Truck: " + brand + ", Rate/day: " + baseRate);
    }
}