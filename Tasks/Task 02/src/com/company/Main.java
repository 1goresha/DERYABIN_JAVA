package com.company;

public class Main {
    public static  int calcDigitQuantityOfNum(int num){//подсчет количества цифр в переменной типа int
        for (int i = 1; i<100; i++){
            num = num/10;
            if (num == 0){
                return i;
            }
        }
        return -1;
    }

    public static int calcDigitOfBinOfNum(int num){//функция считает кол-во цифр числа,переведенного в двоичную систему
        for (int i = 1; i<100; i++){
            num = num/2;
            if (num == 0){
                return i;
            }
        }
        return -1;
    }

    public  static int reverseInt(int num){//не обращай внимание, это сделано чисто по приколу,
        int temp1, temp2 = 0;              //реверс переменной типа int без использования массива
        int a=num;
        for (int i = 0; i<calcDigitQuantityOfNum(a);i++){
            temp1 = num%10;
            temp2 = temp2*10+temp1;
            num = num/10;
        }
        return temp2;
    }


    public  static int[] getArrayOfBinary(int number){//функция возвращает массив цифр двоичного числа
        int a = number;
        int result;
        int binArray[] = new int[calcDigitOfBinOfNum(a)];
        for (int i =0; i <calcDigitOfBinOfNum(a); i++){
            int bin = number%2;
            number = number/2;
            binArray[calcDigitOfBinOfNum(a)-i-1] = bin;//запись в массив происходит с конца
            if (number == 0){
                    return binArray;
            }
        }
        for (int i = 0; i<calcDigitOfBinOfNum(a);i++){//в противном случаи возвращаем массив из -1
            binArray[i]=-1;
        }
        return binArray;
    }

    public static void showElementOfBinArray(int[] arr){//процедура для вывода на экран двоичного числа
        for(int j = 0; j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcDigitOfBinOfNum(22));
        showElementOfBinArray(getArrayOfBinary(22));
    }
}
