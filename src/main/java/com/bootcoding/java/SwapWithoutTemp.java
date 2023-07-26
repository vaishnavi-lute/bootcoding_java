package com.bootcoding.java;

import java.util.Scanner;
public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any 2 number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("before swapping numbers "+a +"    "+ b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping  "+a +"    " + b);
    }
}

