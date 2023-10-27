package com.bootcoding.java.starPattern;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number or symbol");
        int n= scanner.nextInt();
                                  // upper pyramid
        for (int i =1; i<=n; i++) {
            // print spaces
            for (int s=n; s>i; s--) {
                System.out.print(" ");
            }
            // print star
            for (int j=0; j<i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
                                      // lower pyramid
        for (int i=1; i<=n-1; i++) {
            // print spaces
            for (int s=0; s<i; s++) {
                System.out.print(" ");
            }
            // print star
            for (int j=(n-i)*2-1; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
