package com.bootcoding.java.Thread.seiesThread;

import java.util.Scanner;

public class PrimeNumberThread extends Thread {
    public void run(){
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

