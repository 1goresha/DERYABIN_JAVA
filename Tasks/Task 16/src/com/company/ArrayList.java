package com.company;


import com.sun.istack.internal.NotNull;

public class ArrayList {

    public int posFirstNum = getPosFirstNum();
    public int countNum = getCountNum();
    public int posLastNum = posFirstNum + countNum -1;

    public int array[];
    public int num;
    public int index;

    public ArrayList(){
        this.array = new int[4];
        for (int i =0; i < array.length; i++){
            array[i] = i+1;
        }
    }

    public int getPosFirstNum() {//функция ищет позицию первого ненуля
        int posFirstNum = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != 0) {
                posFirstNum = i;
            }
        }
        return posFirstNum;
    }

    public int getCountNum() {//функция ищет кол-во ненулей
        int countNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                countNum++;
            }
        }
        return countNum;
    }

    public void print() {//процедура выводит элементы массива... для удобства
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " , ");
        }
        System.out.println();
    }

    public void add(int num) {
        this.num = num;
        if (countNum >= array.length) {
            System.out.println("Error of operation add! Array is full");
            return;
        }
        for (int i = posFirstNum; i <= posLastNum; i++) {
            if (posLastNum < array.length-1){
                array[posLastNum+1] = num;
            }else if (posLastNum == array.length-1){
                array[i-1] = array[i];
                array[posLastNum] = num;
            }
        }
    }

    public void addToBeginning(int num) {
        this.num = num;
        if (countNum >= array.length) {
            System.out.println("Error of operation addToBeginning! Array is full");
            return;
        }
        for (int i = posFirstNum, j = posLastNum; i <= posLastNum && j >= 0; i++, j--) {
            if (posFirstNum > 0) {
                array[posFirstNum - 1] = num;
            } else if (posFirstNum == 0) {
                array[j + 1] = array[j];
                array[j] = num;
            }
        }
    }

    public void deleteElementByIndex(int index) {
        for (int i = posFirstNum, j = 0; i < posLastNum && j <= posLastNum - index; i++, j++) {
            if (index == posFirstNum || index == posLastNum) {
                array[index] = 0;
            } else if (index < posLastNum && index > posFirstNum) {
                array[index + j] = array[index + j + 1];
            }
        }
    }

    public void insertElementByIndex(int num, int index) {
        this.num = num;
        this.index = index;
        if (countNum >= array.length) {
            System.out.println("Error of operation insertElementByIndex! Array is full");
            return;
        }
        for (int i = posFirstNum, j = posLastNum; i <= index && j >=index; ) {
            if (posLastNum < array.length-1) {
                array[j + 1] = array[j];
                j--;
            } else if(posLastNum == array.length-1) {
                array[i - 1] = array[i];
                array[i] = num;
                i++;
            }
        }
        array[index] = num;
    }
}
