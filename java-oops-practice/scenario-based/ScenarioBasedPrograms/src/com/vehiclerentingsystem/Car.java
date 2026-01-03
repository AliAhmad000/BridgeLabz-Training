package com.vehiclerentingsystem;

public class Car extends Vehicle {
    private double insuranceCharge;

    public Car(String id, String brand, double baseRate, double insuranceCharge) {
        super(id, brand, baseRate);
        this.insuranceCharge = insuranceCharge;
    }

    public double calculateRent(int days) {
        return (baseRate * days) + insuranceCharge;
    }

    public void displayInfo() {
        System.out.println("Car: " + brand + ", Rate/day: " + baseRate);
    }
}