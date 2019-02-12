package com.company;


public class ArrayList<T> implements List<T>{
    private T[] array;
    private final int size = 5;
    private int count;
    public ArrayList(){
        this.array = (T[])new Object[5];
        this.count = 0;
    }

    @Override
    public void addToBegin(T value) {
        for (int i = count; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = value;
        count++;
    }

    @Override
    public void add(T value) {
        array[count] = value;
        count++;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void insert(T element, int index) {
        for (int i= count; i > index ; i--){
            array[i] = array[i-1];
        }
        array[index] = element;
        count++;
    }

    @Override
    public void reverse() {
        for (int i =0; i < array.length/2; i++){
            T temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = temp;
        }
    }

    @Override
    public int getCount(){
        return this.count;
    }

    @Override
    public boolean contains(T element){
        for (int i =0; i < count; i++){
            if(array[i] == element){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(T element){
        for (int i =0; i < count ; i++){
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(int index){
        for (int i = index; i < count ; i++){
            array[i] = array[i+1];
        }
        array[count] = null;     //0
        count--;
    }
}
