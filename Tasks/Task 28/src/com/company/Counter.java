package com.company;

import java.util.ArrayList;

public class Counter extends Thread {
    private int from;
    private int to;
//    private int sumVariable;       //убрал
    private int sumResult;
    private ArrayList<Integer> array;

//    ArrayList<Integer> sumList = new ArrayList<>();     //по моему он тут не нужен вовсе

    public Counter() {
    }

    public Counter(int from, int to, ArrayList<Integer> array) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    @Override
    public void run() {
        summation();
    }

    private void summation() {
        for (int i = from; i < to; i++) {
            sumResult = sumResult + this.array.get(i); //поменял sumVariable на sumResult
        }
//        System.out.println("---> " + sumVariable);     // тоже
//        array.add(sumVariable);                        //убрал
    }

    public int getSumResult() {
//        for (int x : array) {
//            sumResult = sumResult + x;
//        }
        return sumResult;
    }

}