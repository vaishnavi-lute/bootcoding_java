package com.bootcoding.java;
import java.util.Scanner;
public class ForEx2withInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Enter any number
        System.out.println(" Enter any positive number!");
        int n = scanner.nextInt(); //stop/ wait for user input
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number!");
            } else {
                System.out.println(i + " is odd number!");
            }
        }
    }
}


