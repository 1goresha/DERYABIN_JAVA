package com.company;

import java.util.Scanner;

public class Main {

    public static int[] parseMassive(int arr[]){
        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // write your code here
        int array[] = {5, 6, 1, 9, 8};
        int temp;
        int temp2;
        int min=array[0];
        int indexOfMinArray=0;
        /*for (int j = 0; j<array.length;j++){
            for (int i =j+1;i<array.length;i++){
                if (array[i]<min){
                    min = array[i];
                    temp2 = i;
                    indexOfMinArray = temp2;
                }
                temp = array[j];
                array[j] = array[indexOfMinArray];
                array[indexOfMinArray] = temp;
            }
        }*/


        for (int i = 0; i < array.length; i++) {
            System.out.println("Your array" + "[" + i + "] is : " + parseMassive(array)[i]);
        }
    }
}
