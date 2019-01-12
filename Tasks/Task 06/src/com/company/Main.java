package com.company;

public class Main {
    public static void reverseArray(int[] array){
        int temp;
        for(int i = 0; i<array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
	// write your code here

        /*int temp;
        int array[]={3,4,5,6,7};
        for(int i = 0; i<array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }*/
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        reverseArray(array);
    }
}
