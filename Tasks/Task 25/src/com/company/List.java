package com.company;

public interface List<T> {
    void addToBegin(T element);
    void add(T element);
    T get(int index);
    void insert(T element, int index);
    void reverse();
    int getCount();
    boolean contains(T element);
    int indexOf(T element);
    void remove(int index);
}
