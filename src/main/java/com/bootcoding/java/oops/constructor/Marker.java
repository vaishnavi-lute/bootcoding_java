package com.bootcoding.java.oops.constructor;

import java.util.MissingResourceException;

public class Marker {
    String company;
    int price;
    String type;
    String colour;

    public Marker(){
        System.out.println("Default Constructor");
        print();
    }
    public Marker(String s){
        company = "Camlin";
        System.out.println("company name :" + company);
        print();
    }
    public Marker(String s,int p){
        System.out.println("print company name and price of marker");
        company = "Camlin";
        price = p;
        print();
    }
    public Marker(String s,int p,String t,String c){
        System.out.println("print company name, price, type and colour");
        company = "Camlin";
        price = p;
        type = t;
        colour = c;
        print();
    }
    public void print(){
        System.out.println(company);
        System.out.println(price);
        System.out.println(type);
        System.out.println(colour);

    }

    public static void main(String[] args) {
        Marker m = new Marker();
        Marker m2 = new Marker("Camlin");
        Marker m3 = new Marker("Camlin", 35);
        Marker m4 = new Marker("Camlin", 35,"WhiteBoard Marker","black");
    }
}
