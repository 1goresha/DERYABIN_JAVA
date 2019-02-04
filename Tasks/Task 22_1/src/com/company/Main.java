package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Transport bmw = new Transport("bmv",666);
    Transport audi = new Transport("audi",777);
    Transport lada = new Transport("lada",333);
    Transport mersedes = new Transport("mersedes",999);
    Transport volvo = new Transport("volvo",888);

    Parking parking = new Parking();
    parking.park(audi);
    parking.park(bmw);
    parking.park(lada);
    parking.park(mersedes);
    parking.park(volvo);

    parking.parkOut(777);
    parking.parkOut(12);
    }
}
