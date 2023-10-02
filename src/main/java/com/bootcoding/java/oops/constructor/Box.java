package com.bootcoding.java.oops.constructor;

public class Box {

    //Properties,Instance variables or data members
    int length;
    int breadth;
    int height;

    public Box(){
        System.out.println("Default constructor");
        print();
    }
    public Box(int l){
        System.out.println("i am 1 argument constructor");
        length = l;
        print();
    }
    public Box(int l, int b){
        System.out.println("i am 2 argument constructor");
        length = l;
        breadth = b;
        print();
    }
    public Box(int l , int b, int h){
        length = l;
        breadth = b;
        height= h;
        print();

    }
    public void print(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
    }
    public static void main(String[] args) {
        Box b = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(5,6);
        Box b4 = new Box(5,6,7);
    }
}
