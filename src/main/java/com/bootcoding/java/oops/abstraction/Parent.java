package com.bootcoding.java.oops.abstraction;

import jdk.dynalink.NamedOperation;

abstract class Parent {
    double Amount;
    int Quantity;
    public void purchase(double Amount){
        System.out.println(Amount);
    }
    public void purchase(double Amount , int Quantity){
        System.out.println("print amount of product and quantity =" + Amount +" , "+Quantity);
        }
        public void print(){
            System.out.println("your purchasing amount is :" + Amount);
    }
}
