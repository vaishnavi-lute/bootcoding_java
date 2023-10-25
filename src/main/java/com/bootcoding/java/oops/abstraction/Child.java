package com.bootcoding.java.oops.abstraction;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.purchase(20.40);
        child.purchase(35.5,3);
        child.print();
    }
}
