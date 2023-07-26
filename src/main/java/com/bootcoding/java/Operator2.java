package com.bootcoding.java;

public class Operator2 {
    public static void main(String[] args) {
        boolean value = 10 > 20;
        boolean textresult = 'a' == 'b';
        boolean percentage = 75.54 > 60.00;
        double time = 18.30;
        System.out.println(value);
        System.out.println(textresult);
        System.out.println(percentage);
        if (time < 12.00) {
            System.out.println("Good Morning");
        }
        if (time > 12.00 && time < 18.00) {
            System.out.println("Good Afternoon");
        }
        if (time > 18.00) {
            System.out.println("Good Evening");
        }
    }
}