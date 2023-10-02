package com.bootcoding.java.Thread;

public class NumberThread extends Thread {
    public void run(){
        for (int i=0; i <100; i++){
            System.out.println("Number task is executed");
        }
    }
}
