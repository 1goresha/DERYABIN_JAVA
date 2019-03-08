package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        int threadsCount = scanner.nextInt();
//        int numbersCount = scanner.nextInt();
        int threadsCount = 10;
        int numbersCount = 2000000;
        int sumDirectMethod = 0;
        int fromForThread = 0;
        int toForThread = numbersCount/threadsCount;//тут поменял numbersCount на numbersCount/threadCount

        ArrayList<Integer> arrayList = new ArrayList<>(numbersCount);//тут указал размерность листа
        ArrayList<Counter> arrayListWithThread = new ArrayList<>(threadsCount);//тут указал размерность листа и тип Thread поменял на Counter
        Random random = new Random();

        // TODO: генерируете массив чисел
        for (int i = 0; i < numbersCount; i++) {
            arrayList.add(random.nextInt(1000));
            sumDirectMethod += arrayList.get(i);
        }
        // TODO: выводите их сумму
        System.out.println("Прямой метод " + sumDirectMethod);

        // TODO: создаете массив потоков
        // TODO: каждому потоку назначете свой участок

        for (int i = 0, k = numbersCount/threadsCount; i < threadsCount; i++) {//тут ввел переменную k
            arrayListWithThread.add(new Counter(fromForThread, toForThread, arrayList));
            fromForThread += k;//соотвественно тут тоже переделал
            toForThread += k;//соотвественно тут тоже переделал
        }

        // TODO: запускаете каждый поток
        for (int i = 0; i < arrayListWithThread.size(); i++) {
            arrayListWithThread.get(i).start();
            arrayListWithThread.get(i).join();
            System.out.println("Общая сумма по Потоку: " + arrayListWithThread.get(i).getSumResult());
        }

        // TODO: здесь у каждого потока берете sumResult и складываете, смотрите результат.
        int tempSum = 0;
        for (int i = 0 ; i < arrayListWithThread.size(); i++){
            tempSum +=arrayListWithThread.get(i).getSumResult();
        }
        System.out.println("сумма чисел всех потоков = " + tempSum);
        int i =0;
    }
}