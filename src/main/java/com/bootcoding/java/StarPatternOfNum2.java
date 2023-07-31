package com.bootcoding.java;

public class StarPatternOfNum2 {
    //1
    //23
    //456
    //78910
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        int b=1;
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(b++);
            }
            System.out.println();

        }
    }
}