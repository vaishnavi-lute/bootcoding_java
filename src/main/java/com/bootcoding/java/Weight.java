package com.bootcoding.java;
import java.util.Scanner;
public class Weight {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weight");
        double n= scanner.nextDouble();
        double a = n*2.20462;
        System.out.println(a);
    }
}
