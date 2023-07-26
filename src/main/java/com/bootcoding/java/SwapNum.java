package com.bootcoding.java;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any two  number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp=0;
        System.out.println("before swapping numbers: "+a +"  " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: "+a + "    " + b);
        System.out.println( );


    }
}
