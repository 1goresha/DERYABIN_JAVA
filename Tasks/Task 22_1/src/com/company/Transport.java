package com.company;

public class Transport implements Shoot, EngineSound {
    private int num;
    private String name;

    public Transport(String name , int num){
        this.name = name;
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    public String getName(){
        return this.name;
    }

    public void park(Parking parking){
        parking.park(this);
    }

    public void parkOut(Parking parking){
        parking.parkOut(this.getNum());
    }

    @Override
    public void shoot(int countOfPiy) {
        System.out.println(this.getName());
        for (int i = 0; i < countOfPiy; i++){
            System.out.println("piy");
        }
    }

    @Override
    public void makeNoise(String noise) {
        System.out.println(this.getName() + " " + noise);
    }
}
