package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int array[] = {5, 2, 10, 9, 8};
        int max;


        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j] > array[i]) {
                    max = array[j];
                    array[j] = array[i];
                    array[i] = max;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Your array" + "[" + i + "] is : " + array[i]);
        }
    }
}
