package com.bootcoding.java.exceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int a[] = {10, 20, 30, 40, 50};
                System.out.println(a[2]);
            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println(a);
            }
            System.out.println(10 / 0);
        }
            catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Learn Coding");
    }
}
