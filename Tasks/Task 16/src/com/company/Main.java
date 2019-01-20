package com.company;

public class Main {
    public static void main(String[] args) {
//        int array[] = {-3,4,0,0,0};
        ArrayList list = new ArrayList();
        list.add(9);
        list.print();
        list.addToBeginning(1);
        list.print();
        list.insertElementByIndex(6, 1);
        list.print();
    }
}
