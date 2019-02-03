package com.company;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args){
        MyScanner scanner = new MyScanner("file.txt") ;
        scanner.nextInt();
    }
}
