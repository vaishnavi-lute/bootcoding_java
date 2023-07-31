package com.bootcoding.java;

import java.util.Scanner;

public class DiamondPattern {
    //    *
    //   ***
    //  *****
    //   ***
    //    *
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number or any pattern");
        int n = scanner.nextInt();
        int i, j;
        int s = 0;
        for (i = 1; i <= n; i++) // row
        {
            for (s = 1; s <= n - i; s++)//space
            {
                System.out.print(" ");
            }
            for (j = 1; j <= i * 2 - 1; j++) //column
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <=n; i++) // row
        {
            for (s = 0; s<i;s++)//space
            {
                System.out.print(" ");
            }
            for ( j =(n-i)*2-1; j>0; j--) //column
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}