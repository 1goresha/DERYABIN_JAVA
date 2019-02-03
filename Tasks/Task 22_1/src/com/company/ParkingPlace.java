package com.company;

public class ParkingPlace{
    private Transport transport;
    private int num;

    public Transport getTransport(){
        return this.transport;
    }

    public int getNum(){
        return this.num;
    }

    public void setTransport(Transport transport){
        this.transport = transport;
    }

    public void setNum(int num){
        this.num = num;
    }
}
