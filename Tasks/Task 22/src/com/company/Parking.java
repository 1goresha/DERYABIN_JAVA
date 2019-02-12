package com.company;

public class Parking {
    private int gosNum;
    private Vehicle[] vehicles;
    private int count;
    private static final int MAX_SIZE_PARKING = 8;
    private int elementsLengthOfArray;

    public Parking() {
        vehicles = new Vehicle[MAX_SIZE_PARKING];
        count = 0;
    }

    public Vehicle[] getVehicles(){
        return this.vehicles;
    }


    void showArray(){
        for (int i =0; i <vehicles.length-1 && vehicles[i] != null; i++){
            System.out.println(vehicles[i] + " " + vehicles[i].getGosNum() + " " + vehicles[i].getName());
        }
    }

     private boolean isGosNumOnParking(Vehicle vehicle) {
        for (int i = 0; i < this.vehicles.length-1 && this.vehicles[i] != null; i++){
            if (vehicle.getGosNum() == this.vehicles[i].getGosNum()){
                System.out.println(vehicle.getName() + " and " + vehicles[i].getName() + " have the same gos number!");
                return true;
            }
        }
        return false;
    }

    void parkIn(Vehicle vehicle) {
        for (int i = 0; i < count; i++){
            if (vehicle.getGosNum() == this.vehicles[i].getGosNum()){
                System.out.println(vehicle.getName() + " and " + vehicles[i].getName() + " have the same gos number!");
                return;
            }
        }
        this.vehicles[count] = vehicle;
        count++;
    }

    Vehicle[] complitingArray(Vehicle[] vehicles){
        for (int i = 0; i < vehicles.length-1; i++){
            if (vehicles[i] == null){
                for (int k =i; k < vehicles.length - 1 - i; k++){
                    vehicles[k] = vehicles[k+1];
                }
            }
        }
        return vehicles;
    }

    void parkOut(int gosNum) {
        for (int i = 0; i < this.vehicles.length - 1 && this.vehicles[i] != null; i++) {
            if (this.vehicles[i].getGosNum() == gosNum){
                System.out.println(this.vehicles[i].getGosNum() + " is leaving the parking");
                vehicles[i] = null;
                complitingArray(this.vehicles);
            }
        }
    }
}
