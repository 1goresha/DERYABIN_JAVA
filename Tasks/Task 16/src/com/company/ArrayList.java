package com.company;


import com.sun.istack.internal.NotNull;

public class ArrayList {
    private int array[];

    public ArrayList(int arr[]) {
        this.array = arr;
    }
//    public ArrayList(){
////        this.array = new int[4];
////        for (int i =0; i < array.length; i++){
////            array[i] = i+1;
////        }
////    }

    private int getPosFirstNum() {//функция ищет позицию первого ненуля
        int posFirstNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                posFirstNum = i;
                return posFirstNum;
            }
        }
        return posFirstNum;
    }

    private int getCountNum() {//функция ищет кол-во ненулей
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
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
        if (countNum >= array.length) {
            System.out.println("Error of operation add! Array is full");
            return;
        }
        for (int i = posFirstNum; i <= posLastNum; i++) {
            if (posLastNum < array.length - 1) {
                array[posLastNum + 1] = num;
            } else if (posLastNum == array.length - 1) {
                array[i - 1] = array[i];
                array[posLastNum] = num;
            }
        }
    }

    public void addToBeginning(int num) {
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
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
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
        for (int i = posFirstNum, j = 0; i < posLastNum && j <= posLastNum - index; i++, j++) {
            if (index == posFirstNum || index == posLastNum) {
                array[index] = 0;
            } else if (index < posLastNum && index > posFirstNum) {
                array[index + j] = array[index + j + 1];
            }
        }
    }

    public void insertElementByIndex(int num, int index) {
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
        if (countNum >= array.length) {
            System.out.println("Error of operation insertElementByIndex! Array is full");
            return;
        }
        for (int i = posFirstNum, j = posLastNum; i <= index && j >= index; ) {
            if (posLastNum < array.length - 1) {
                array[j + 1] = array[j];
                j--;
            } else if (posLastNum == array.length - 1) {
                array[i - 1] = array[i];
                array[i] = num;
                i++;
            }
        }
        array[index] = num;
    }

    public void reverse() {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public void sort() {
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
        int temp = array[0];
        for (int i = posFirstNum; i <= posLastNum; i++) {
            for (int j = i + 1; j <= posLastNum; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public boolean contains(int num) {
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
        for (int i = posFirstNum; i <= posLastNum; i++){
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }

    public int indexOf(int num) {
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
        for (int i = posFirstNum; i <= posLastNum; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }

    public int get(int index) {
        int posFirstNum = getPosFirstNum();
        int countNum = getCountNum();
        int posLastNum = posFirstNum + countNum - 1;
        if (index <= posLastNum && index >= posFirstNum) {
            return array[index];
        }
        return -1;
    }

    public int getCount() {//функция ищет кол-во ненулей
        int countNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                countNum++;
            }
        }
        return countNum;
    }
}
