package com.company;

import java.util.Scanner;

public class Main {

    public static int lineFinder(char text[], char line[]){
        int j = 0;
        for(int i = 0;i<text.length;i++){
            if (line[j] == text[i]){
                System.out.println("line["+j+"] == text["+i+"] and j = "+j);
                if (j == line.length-1){
                    System.out.println("j("+j+") == line.length("+line.length+")-1");
                    return i-(line.length-1);
                }
                j++;
            }
        }
        return -1;
    }

    public static int lineFinder2(char text[], char line[]) {
        //int i = 0;
        for (int i = 0; i < text.length; i++) {
            for (int j = 0; line[j] == text[i]; j++, i++) {
                if (j == line.length-1) {
                    return i-(line.length-1);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        char text[] = scanner.nextLine().toCharArray();
        char line[] = scanner.nextLine().toCharArray();
        int result = lineFinder2(text,line);
        System.out.println(result);
    }
}
