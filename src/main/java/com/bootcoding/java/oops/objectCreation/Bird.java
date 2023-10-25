package com.bootcoding.java.oops.objectCreation;

public class Bird {
    String breed;
    static String type;
    String color;
    String size;

    public static void main(String[] args) {
        Bird b = new Bird();
        b.breed = "Eagle";
        b.color = "Dark brown";
        Bird.type = "African-fish eagle";
        b.size = "Large";
        System.out.println("BREED :" + b.breed);
        System.out.println("COLOR :" + b.color);
        System.out.println("SIZE :" + b.size);
        System.out.println("TYPE :" + Bird.type);
        Bird.eat();
        Bird.nature();
}
    public static void eat(){
        System.out.println("Eagles eat only non-veg");
    }
    public static void nature(){
        System.out.println("Eagles are known for their sharp vision.");
    }
}
