package com.company;

public class Recursive {
    public static int fact(int a){
        System.out.println("In fact with " + a);
        if (a==1){
            System.out.println("Out fact with " + a);
            return a;
        }
        int result = fact(a-1) * a;
        System.out.println("Out fact with " + result);
        return result;
    }

    static int result = 0;

    public static int fib(int n){

        System.out.println("in fib with " + n);
        //int result;
        if (n==0 || n==1){
            System.out.println("out fib with result(IF) " + n + "     and n = " + n);
            return n;
        }
        result = fib(n-1)+n;
        System.out.println("out fib with result " + result + "     and n = " + n);
        return result;
    }

    public static void main(String[] args) {
        //System.out.println( fact(5));
        System.out.println(fib(10));
    }

}
