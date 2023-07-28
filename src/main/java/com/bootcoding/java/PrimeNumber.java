package com.bootcoding.java;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int num= scanner.nextInt();
        int i=2;
        boolean p= true;
        while(i<num){
            if(num % i == 0){
                p=false;
                break;
            }
            i++;
         }
        if (p==true){
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is not prime number");
        }
    }
}
