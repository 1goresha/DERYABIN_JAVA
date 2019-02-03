package com.company;

public class Parking {
    private ParkingPlace[] parkingPlaces;
    private final int maxSize = 5;
    private int count;

    public Parking(){
        this.parkingPlaces = new ParkingPlace[maxSize];
        for(int i =0; i <parkingPlaces.length-1; i++){
            this.parkingPlaces[i] = new ParkingPlace();
        }
    }

    public void park(Transport transport){
        for (int i =0;i < parkingPlaces.length-1;i++){
            if (parkingPlaces[i].getNum() == 0){
                parkingPlaces[i].setTransport(transport);
                parkingPlaces[i].setNum(transport.getNum());

                return;
            }
        }
    }

}
