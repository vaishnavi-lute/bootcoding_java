package com.bootcoding.java;

public class StarPatternOfNum {
    //1
    //12
    //123
    //1234
    //12345
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
                System.out.println();
        }
    }
}