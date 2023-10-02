package com.bootcoding.java.oops.constructor;

public class MarkerEx {
    public String color;
    public String company;
    public double price;

    public MarkerEx(){
        System.out.println("Default Constructor");
    }
    public MarkerEx(String color){
        this();
        System.out.println("One Argument Constructor");
        this.color = color;
    }
    public MarkerEx(String color, String company){
        this(color);
        System.out.println("2 Argument Constructor");
        this.color = color;
        this.company = company;
    }
    public MarkerEx(String company, double price){
        this("BLUE", company);
        System.out.println("2 Argument with price Constructor");
        this.company = company;
        this.price = price;
    }

    public static void main(String[] args) {
        Marker m = new Marker("Camlin", 100);
        Marker m2 = new Marker();
    }
}
