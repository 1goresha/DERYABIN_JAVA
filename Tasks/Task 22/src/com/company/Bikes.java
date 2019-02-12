package com.company;

public class Bikes extends GroundVehicle {


    public Bikes(String name, int gosNum, int speed) {
        super(name, gosNum, speed);
    }

    @Override
    void engineSound(){
        System.out.println("vrum vrum vrum!");
    }
}
