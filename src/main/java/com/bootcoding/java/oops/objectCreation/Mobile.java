package com.bootcoding.java.oops.objectCreation;

public class Mobile {
    //properties /variables

    String model;
    int ram;
    String company;

    public static void main(String[] args){
        Mobile m = new Mobile();
        m.print();
        m.model = "Iphone 14";
        m.company ="Apple";
        m.ram = 8;
        m.print();
        m.turnOn();
        m.playGames();
        m.calling();
        m.search();

    }
    void print(){
        System.out.println("MODEL : "+ model);
        System.out.println("RAM :"+ ram);
        System.out.println("COMPANY :"+ company);
    }
    //behaviours / methods
    void turnOn(){
        System.out.println("phone is switched on!");
    }
    void calling(){
        System.out.println("calling others!");
    }
    void playGames(){
        System.out.println("playing games!");
    }
    void search(){
        System.out.println("searching for...");
    }
}
