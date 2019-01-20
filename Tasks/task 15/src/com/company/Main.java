package com.company;


public class Main {

    public static int getPosFirstNum(int array[]) {//функция ищет позицию первого ненуля
        int posFirstNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                posFirstNum = i;
                return posFirstNum;
            }

        }
        return posFirstNum;
    }

    public static int getCountNum(int array[]) {//функция ищет кол-во ненулей
        int countNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                countNum++;
            }
        }
        return countNum;
    }

    public static void print(int array[]) {//процедура выводит элементы массива... для удобства
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " , ");
        }
        System.out.println();
    }

    public static void add(int array[], int num) {
        int posFirstNum = getPosFirstNum(array);
        int countNum = getCountNum(array);
        int posLastNum = posFirstNum + countNum -1;
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

    public static void addToBeginning(int array[], int num) {
        int posFirstNum = getPosFirstNum(array);
        int countNum = getCountNum(array);
        int posLastNum = posFirstNum + countNum -1;
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

    public static void deleteElementByIndex(int array[], int index) {
        int posFirstNum = getPosFirstNum(array);
        int countNum = getCountNum(array);
        int posLastNum = posFirstNum + countNum - 1;
        for (int i = posFirstNum, j = 0; i < posLastNum && j <= posLastNum - index; i++, j++) {
            if (index == posFirstNum || index == posLastNum) {
                array[index] = 0;
            } else if (index < posLastNum && index > posFirstNum) {
                array[index + j] = array[index + j + 1];
            }
        }
    }

    public static void insertElementByIndex(int array[], int num, int index) {
        int posFirstNum = getPosFirstNum(array);
        int countNum = getCountNum(array);
        int posLastNum = posFirstNum + countNum - 1;
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

    public static void main(String[] args) {
        int array[] = {0, 0, 4, 5, 6, 7, 0};
        // write your code here
//        add(array, 9);
//        print(array);
//        add(array, 9);
//        print(array);
//        addToBeginning(array, 99);
//        print(array);
//        deleteElementByIndex(array, 6);
//        print(array);
//        addToBeginning(array, 99);
//        print(array);
        insertElementByIndex(array, 99,3);
        print(array);
        insertElementByIndex(array, 99,3);
        print(array);
        insertElementByIndex(array, 99,3);
        print(array);
        insertElementByIndex(array, 99,3);
        print(array);
    }
}
