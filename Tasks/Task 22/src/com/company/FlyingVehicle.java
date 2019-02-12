package com.company;

public class FlyingVehicle extends Vehicle {
    private int height;
    public FlyingVehicle(String name, int gosNum, int speed, int height) {
        super(name, gosNum, speed);
        this.height = height;
    }
}
