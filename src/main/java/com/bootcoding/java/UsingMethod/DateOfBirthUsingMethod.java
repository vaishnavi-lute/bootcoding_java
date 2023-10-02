package com.bootcoding.java.UsingMethod;

import java.util.Scanner;

public class DateOfBirthUsingMethod {
    public static void main(String[] args) {
    dateOfBirth(04-01-2000);
    }
    public static void dateOfBirth(int dob){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date Of Birth in DD-MM-YYYY");
        String a = scanner.nextLine();
        String[] arr = a.split("-");
        System.out.println("your date of birth is: " + arr[0]);
        System.out.println("your birth of month is: " + arr[1]);
        System.out.println("your birth of year is: " + arr[2]);
    }
}
