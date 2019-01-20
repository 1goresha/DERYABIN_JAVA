package com.company;

public class Main {
    public static void main(String[] args) {
        int array[] = {-3,4,0,0,0,0};
        ArrayList list = new ArrayList(array);
        list.add(9);
        list.print();
        list.add(9);
        list.print();
        list.addToBeginning(6);
        list.print();
        list.insertElementByIndex(77, 1);
        list.print();
        list.reverse();
        list.print();
        System.out.println(list.getCountNum());
        list.sort();
        list.print();
        System.out.println(list.contains(77));
        System.out.println(list.indexOf(6));
    }
}
