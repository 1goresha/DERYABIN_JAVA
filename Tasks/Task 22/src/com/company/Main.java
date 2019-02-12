package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tanks tankkk = new Tanks("ttt",01234,30);
        Vehicle tank = new Tanks("t34", 18,60);
        Vehicle car = new Cars("toyota", 666, 120);
        Vehicle bike = new Bikes("suzuki", 999,160);
        Vehicle car2 = new Cars("BMW", 777, 180);
        Vehicle bike1 = new Bikes("BMX", 123, 170);
        Parking parking = new Parking();
//        bike1.engineSound();

        parking.parkIn(tank);
        parking.parkIn(car);
        parking.parkIn(car2);
        parking.parkIn(bike1);
        parking.parkIn(tank);

        parking.showArray();

//        parking.parkOut(777);
//        parking.showArray();

    }
}
