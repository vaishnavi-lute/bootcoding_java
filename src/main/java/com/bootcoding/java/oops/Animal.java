package com.bootcoding.java.oops;

public class Animal {
    //Instance variable
    String name;
    static String type;
    String color;

    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "cat";
        cat.color = "black";
        // Access - classname se access kar sakte ho
        Animal.type = "Animal";
        Animal dog = new Animal();
        dog.name = "leo";
        dog.color = "white";
        System.out.println(cat.type);
        System.out.println(dog.type);
        System.out.println(cat.color);
        System.out.println(dog.color);
        Animal.eat();
        Animal a= new Animal();
        a.run();

        // static method - access by class
        //non-static method -  access by object

    }
    public static void eat(){
        System.out.println(" I am static method eat()");

    }
    public void run(){
        System.out.println("I am non-static method run()");
    }
    public void drink(){
        System.out.println("drink water ");
    }
}
