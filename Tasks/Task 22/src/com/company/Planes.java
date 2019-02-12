package com.company;

public class Planes extends FlyingVehicle implements Flyable{
    private int height;
    private int speed;
    public Planes(String name, int gosNum, int speed, int height) {
        super(name, gosNum, speed, height);
        this.height = height;
        this.speed = speed;
    }

    @Override
    public void fly(int heightOfFly, int flySpeed) {

    }

    public void forsage(){
        int forsageSpeed = this.speed * 3;
        String cloud = "( )";
        for (int i = this.speed; i <=forsageSpeed; i +=300){
            System.out.println(cloud);
            cloud += "( )";
        }
    }
}
