package com.bootcoding.java.starPattern;

import java.util.Scanner;
//12345
//1234
//123
//12
//1
public class TriangleStarPattern2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scanner.nextInt();
        int i, j;
        for (i = n; i >0; i--)//row
            {
            for (j = 1; j <= i; j++)//column
            {
                System.out.print(j);
            }
            System.out.println();
            }

    }
}
