package com.company;

public interface IntegerList {
    void addToBegin(int value);
    void add(int value);
    int get(int index);
    void insert(int element, int index);
    void reverse();
    int getCount();
    void sort();
    boolean contains(int element);
    int indexOf(int element);
    void remove(int index);
}
