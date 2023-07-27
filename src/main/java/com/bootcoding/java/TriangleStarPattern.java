package com.bootcoding.java;
public class TriangleStarPattern {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=0; i<=n;i++){
            for( j=1; j<=i; j++){
                System.out.print("  *  ");
            }
            System.out.println();
        }
    }
}
