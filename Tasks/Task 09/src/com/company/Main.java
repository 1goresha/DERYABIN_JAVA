package com.company;
import sun.nio.cs.ext.SJIS;

import java.util.Scanner;

public class Main {

    public static int fromArrayOfCharToInt(char array[]){
        int tempNum = 0;
        for (int i=0;i<array.length;i++){
            tempNum = tempNum*10;
            tempNum = (array[i] - '0')+tempNum;
        }
        return tempNum;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        char arrayOfChars[] = scanner.nextLine().toCharArray();
        System.out.println(fromArrayOfCharToInt(arrayOfChars));



    }
}
