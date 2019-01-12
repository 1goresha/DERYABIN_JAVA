package com.company;

public class Main {
    public static int getMaxOfArray(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMinOfArray(int arr[]){
        int min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // write your code here
        int array[] = {0, 5, 2, 7, 1, 9};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }


        System.out.println(getMaxOfArray(array));
        System.out.println(getMinOfArray(array));

    }
}
