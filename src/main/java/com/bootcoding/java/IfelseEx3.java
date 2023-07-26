package com.bootcoding.java;
import java.util.Scanner;
public class IfelseEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Enter Any Number
        System.out.println("Enter Any Positive Number!");
        int n = scanner.nextInt(); //stop /wait for user input
        if (n % 2 == 0) {
            System.out.println("Even Number is " + n + "!"); // concatination Operator
            System.out.println(n + " is Even Number"); // concatination operator
        } else {
            System.out.println(" ODD Number");
        }
    }
}