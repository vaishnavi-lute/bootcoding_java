package com.bootcoding.java.UsingMethod;

import java.util.Scanner;

public class SquareByMethod {
    public static void main(String[] args) {
        //2 = 4
        //3 = 9
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int a= scanner.nextInt();
        Square(a);
    }
    public static void Square(int n){
       // int n = scanner.nextInt();
        int a = n*n;
        System.out.println("Square of given number is: " + a);

    }
}
