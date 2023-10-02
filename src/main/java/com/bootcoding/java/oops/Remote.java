package com.bootcoding.java.oops;

public class Remote {
    String model;
    String size;
    String company;

    public static void main(String[] args) {
        Remote r = new Remote();
        r.model="LED REMOTE";
        r.size= "medium";
        r.company="sony";
        r.MenuButton();
        r.turnOn();
        r.volumeButton();
        r.print();
    }
    void print(){
        System.out.println("MODEL:" + model);
        System.out.println("SIZE :" + size);
        System.out.println("COMPANY :" + company);
    }
    void MenuButton(){
        System.out.println("using menu button you can go to the menu");
    }
    void turnOn(){
        System.out.println("using remote turn on the tv");
    }
    void volumeButton(){
        System.out.println("adjust volume using volume button");
    }
}
