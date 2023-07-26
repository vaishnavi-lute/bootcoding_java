package com.bootcoding.java;
import java.util.Scanner;
public class MaxNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a>b && a>c)
        {
            System.out.println(a +" is Greater Number");

        }if(b>a && b>c)
        {
            System.out.println(b + "is Greater Number");
        }
        if(c>a && c>b){
            System.out.println(c +" is Greater Nummber");
        }
    }
}
