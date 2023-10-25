package com.bootcoding.java.starPattern;

public class StarPatternOfNum1 {
    //1
    //22
    //333
    //4444
    //55555
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}