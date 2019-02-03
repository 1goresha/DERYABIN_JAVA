package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class MyScanner {
    private String fileName;
    private InputStream stream;
    private int digit;
    private String s = "";
    private int num;
    private char ch;

    public MyScanner(String fileName) {
        if (fileName != null) {
            this.fileName = fileName;
            try {
                stream = new FileInputStream(this.fileName);
            } catch (FileNotFoundException e) {
                System.out.println("Такого файла нет!");
                throw new IllegalArgumentException(e);
            }
        } else {
            throw new NullPointerException();
        }
    }

    public int nextInt() {
        try {
            num = 0;
            digit = stream.read();
            while (digit != -1) {
                if((char)digit >='0' && (char)digit <='9'){
                    num = num * 10;
                    num = (digit - '0') + num;
                    digit = stream.read();
                }else{
                    System.out.println("Ошибка приеобразования!");
                    return -1;
                }
            }
        } catch (IOException e) {
            System.out.println("Что - то пошло не так...!");
            throw new IllegalArgumentException(e);
        }
        System.out.println(num);
        return digit;
    }
}
