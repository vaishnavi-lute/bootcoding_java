package com.bootcoding.java.oops.polymorphism.overloading;

public class Subtraction {
    public void Sub(int a,int b){
        int  sub=a-b;
        System.out.println(sub);
    }
    public void Sub(int a, int b, int c){
        int sub = a - b - c;
        System.out.println(sub);
    }
}
