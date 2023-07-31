package com.bootcoding.java;

import java.util.Scanner;
public class WhileLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            }
            else {
                num = num - 1;
                count++;
            }

        }
        System.out.println(count + "  is count of given no.");
    }
}