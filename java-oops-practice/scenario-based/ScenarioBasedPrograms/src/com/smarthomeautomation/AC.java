package com.smarthomeautomation;

public class AC extends Appliance {

    public AC() {
        super(1500); // heavy power usage
    }

    public AC(int watts) {
        super(watts);
    }

    public void turnOn() {
        setState(true);
        System.out.println("AC is ON → Cooling system activated");
    }

    public void turnOff() {
        setState(false);
        System.out.println("AC is OFF");
    }

    public void deviceStatus() {
        System.out.println("AC | Power: " + getPowerConsumption() + "W | State: " + isOn());
    }
}