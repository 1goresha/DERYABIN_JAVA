package com.company;

public class GroundVehicle extends Vehicle{


    public GroundVehicle(String name, int gosNum, int speed) {
        super(name, gosNum, speed);
    }

    @Override
    void engineSound(){
        System.out.println("vrum vrum vrum!!");
    }
}
