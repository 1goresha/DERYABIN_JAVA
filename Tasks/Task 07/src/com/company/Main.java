package com.company;

public class Main {

    public static int quantityOfLocalNum(int []arr){
        int countLocal = 0;
        int localMin = 0;
        int localMax = 0;
        for(int i =0; i < arr.length; i++){
            if(i == 0){
                i++;
            }
            if(i == arr.length-1){
                return countLocal;
            }
            localMin++;
            localMax++;
            countLocal = localMin + localMax;
        }
        return countLocal ;
    }

    public static void main(String[] args) {
	// write your code here
    int []arr = {0,1,2,3,4};
        System.out.println(quantityOfLocalNum(arr));

    }
}
