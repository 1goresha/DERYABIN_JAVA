package com.company;

public class Parking {
    private ParkingPlace[] parkingPlaces;
    private final int maxSize = 5;
    private int count;

    public Parking(){
        this.parkingPlaces = new ParkingPlace[maxSize];
        for(int i =0; i <parkingPlaces.length; i++){
            this.parkingPlaces[i] = new ParkingPlace();
        }
    }

    public void park(Transport transport){
        for (int i =0;i < parkingPlaces.length;i++){
            if (parkingPlaces[i].getTransport() == null){
                parkingPlaces[i].setTransport(transport);
                System.out.println(parkingPlaces[i].getTransport().getName()+ " припарковалась(ся)");
                return;
            }
        }
        System.out.println("Мест нет");
    }

    public void parkOut(int gosNum){
        for (int i =0;i < parkingPlaces.length;i++){
            if (parkingPlaces[i].getTransport() != null && parkingPlaces[i].getTransport().getNum() == gosNum){
                System.out.println("Автомобиль " + parkingPlaces[i].getTransport().getName() + " с гос номером " + gosNum + " покидает парковку");
                parkingPlaces[i].setTransport(null);
                return;
            }
        }
        System.out.println("Транспортного средства с гос номером " + gosNum + " на парковке нет");
    }

}
