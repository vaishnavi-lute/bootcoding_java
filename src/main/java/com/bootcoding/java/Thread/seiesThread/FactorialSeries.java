package com.bootcoding.java.Thread.seiesThread;

import java.util.Scanner;

public class FactorialSeries extends Thread{
    public void run(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter any Number");
        int n= scanner.nextInt();
        int i=1;
        int fact=1;
        while (i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact+ "  is factorial number of" + "  "+ n);
    }
    }

