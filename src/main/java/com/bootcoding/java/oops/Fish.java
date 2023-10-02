package com.bootcoding.java.oops;

public class Fish {
    String breed;
    static String type;
    String color;
    String size;

    public static void main(String[] args) {
        Fish f = new Fish();
        f.breed = "Gold";
        f.color = "Orange+Gold";
        f.size = "Medium";
        Fish.type = "Pond fish";
        System.out.println("BREED :" + f.breed);
        System.out.println("COLOR :" +f.color);
        System.out.println("SIZE :" + f.size);
        System.out.println("TYPE :" + Fish.type);
        Fish.eat();
        Fish.play();
        Fish.nature();
    }
    public static void eat(){
        System.out.println("fish eat dry worms and their special food");
    }
    public static void play(){
        System.out.println("fish play with stones and others fish");
    }
    public static void nature(){
        System.out.println(" gold fishes are very friendly and quiet in nature");
    }

}
