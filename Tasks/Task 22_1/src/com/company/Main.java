package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Transport bmw = new Transport("bmv",666);
    Transport audi = new Transport("audi",777);
    Transport lada = new Transport("lada",333);
    Transport mersedes = new Transport("mersedes",999);
    Transport volvo = new Transport("volvo",888);
    Transport tank = new Transport("T34", 1945);
    Transport car = new Car("NIVA",123);
    Parking parking = new Parking();
//    parking.park(audi);
//    parking.park(bmw);
//    parking.park(lada);
//    parking.park(mersedes);
//    parking.park(volvo);
        car.park(parking);
    lada.park(parking);
    bmw.park(parking);
    audi.park(parking);
    volvo.park(parking);
    lada.makeNoise("vrum vrum");
    tank.shoot(5);

//    parking.parkOut(777);
//    parking.parkOut(12);

        lada.parkOut(parking);
    }
}
