package com.company;

public abstract class Vehicle {
    private String name;
    private int gosNum;
    private int km;
    private int speed;

    public Vehicle(String name, int gosNum, int speed){
        this.gosNum = gosNum;
        this.name = name;
        this.speed = speed;
    }

    int getGosNum(){
        return this.gosNum;
    }

    String getName(){
        return this.name;
    }

    void go(int km){
        this.km+=km;
    }

    void engineSound(){
        System.out.println("vrum vrum vrum!!!");
    }
}
