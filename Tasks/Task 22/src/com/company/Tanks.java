package com.company;

public class Tanks extends GroundVehicle implements Shootable{


    public Tanks(String name, int gosNum, int speed) {
        super(name, gosNum, speed);
    }

    @Override
    public void shoot(int countOfPiy) {
        for (int i = 0; i < countOfPiy; i++){
        System.out.println("piy ");
        }
    }
}
