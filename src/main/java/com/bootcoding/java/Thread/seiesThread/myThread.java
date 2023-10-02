package com.bootcoding.java.Thread.seiesThread;

public class myThread {
    public static void main(String[] args) {
        System.out.println("enter any number");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        myThread t1= new myThread();

    }
}
