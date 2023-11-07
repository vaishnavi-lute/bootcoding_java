package com.bootcoding.java.exceptionHandling;

public class ExException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception successfully handled");
        }
    }
}
// here ,the exception is number is not divisible by 0 means arithmetic exception