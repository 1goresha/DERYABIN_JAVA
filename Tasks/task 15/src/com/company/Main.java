package com.company;


public class Main {

    public static void insertInPosition(int array[],int number, int position){
        if(array[position]!=0){
            for (int i = position; i<array.length;i++){
                array[i] = number;

            }
        }

    }

    public static void main(String[] args) {
	// write your code here
        int array[] = new int[6];
        System.out.println(array[5]);
    }
}
