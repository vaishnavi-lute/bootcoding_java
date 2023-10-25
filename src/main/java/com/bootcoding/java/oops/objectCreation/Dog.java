package com.bootcoding.java.oops.objectCreation;

public class Dog {
    String name;
    static String breed;
    String color;

    public static void main(String[] args) {
      Dog d = new Dog();
      d.name = "Duggu";
      d.color = "off white";
      Dog.breed = "Labrador";
        System.out.println("NAME :" + d.name);
        System.out.println("COLOR :" + d.color);
        System.out.println("BREED :" + Dog.breed);
        Dog.eat();
        Dog d1 = new Dog();
        d1.run();
        Dog.lazy();
    }
    public static void eat(){
        System.out.println("Duggu eating a fish very happily");
    }
    public void run(){
        System.out.println("Duggu runs very fast");
    }
    public static void lazy() {
        System.out.println("Duggu is very lazy");
    }
}
