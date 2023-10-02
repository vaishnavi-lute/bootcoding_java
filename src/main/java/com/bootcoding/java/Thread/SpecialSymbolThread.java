package com.bootcoding.java.Thread;

public class SpecialSymbolThread extends Thread{
    public void run(){
        for (int i= 0; i<100; i++){
            System.out.println("Special Symbol thread is executed");
        }
    }
}
