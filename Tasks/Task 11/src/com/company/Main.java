package com.company;

public class Main {
    public static int binSearch(int []array, int num){
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left)/2;
        for (int i = 0; i<array.length; i++){
            middle = left + (right - left)/2;
            if (num == array[middle]){
                return array[middle];
            }
            if (num < array[middle] && num > array[left]){
                right = middle;
            }
            if (num > array[middle] && num < array[right]){
                left = middle;
            }
        }
        return array[middle];
    }

    public static void main(String[] args) {
	// write your code here
        int []array = {2,10,15,20,32,44,59,68,77,89,99};
        System.out.println(binSearch(array, 77));
    }
}
