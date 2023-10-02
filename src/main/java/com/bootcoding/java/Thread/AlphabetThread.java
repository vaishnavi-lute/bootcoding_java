package com.bootcoding.java.Thread;

public class AlphabetThread extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("alphabet thread is executed");
        }
    }
}
