package com.bootcoding.java.oops.polymorphism.overloading;

public class Addition {
    public void Add(int a ,int b){
      int add = a+b;
        System.out.println(add);
    }

    public void Add(int a, int b, int c){
        int add = a+b+c;
        System.out.println(add);
    }
}

