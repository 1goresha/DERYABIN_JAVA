package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int position;
        Scanner scanner = new Scanner(System.in);

        int lastDigit;
        int sumDigit;
        int divider;
        int multiplication = 1;
        System.out.println("Input two-digit or more number please : ");
        int in = scanner.nextInt();

        for (position = 1; in != -1; position++) {//выполняется один раз, затем ждет ввод нового числа и по новой
            sumDigit = 0;
            if (in >= 10) {//условие ввода двузначного числа
                for (int j = 0; in > 0; j++) {//цикл сложения цифр
                    lastDigit = in % 10;//последняя цифра
                    //System.out.println("lastDigit "+lastDigit);
                    sumDigit = sumDigit + lastDigit;//сумма последних цифр
                    //System.out.println("sumDigit "+sumDigit);
                    in = in / 10;//число за минусом последней цифрой
                }
                for (divider = 2; divider < sumDigit / 2; divider++) {//цикл для проверки на четность
                    if (sumDigit % divider == 0) {
                        multiplication = multiplication * position;
                        //System.out.println("multiplication "+multiplication);
                    }
                }
            } else {//иначе просит ввести двузначное число
                //System.out.println("Wrong number, input two-digit or more number please : ");
            }
            in = scanner.nextInt();
        }
        System.out.println("multiplication = " + multiplication);
    }
}
