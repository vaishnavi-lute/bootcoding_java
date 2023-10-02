package com.bootcoding.java.UsingMethod;

import java.util.Scanner;

public class MaxElementByMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        maxNum(a,b,c);
    }

    public static void maxNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is Greater Number");
        }
        if (b > a && b > c) {
            System.out.println(b + "is Greater Number");
        }
        if (c > a && c > b) {
            System.out.println(c + " is Greater Number");
        }
    }
}