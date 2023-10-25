package com.bootcoding.java.oops.objectCreation;

public class Door {
    String woodenType;
    int cm;
    String quality;

    public static void main(String[] args){
        Door d = new Door();
        d.woodenType = "oak wooden";
        d.cm=500;
        d.quality="long lasting";
        d.quality();
        d.features();
        d.material();
    }
    void print(){
        System.out.println("WOODENTYPE :" +woodenType);
        System.out.println("CENTIMETER : " + cm);
        System.out.println("QUALITY :" + quality);
    }
    void material(){
        System.out.println("oak wood");
    }
    void features(){
        System.out.println("door mirror,door lock, door handle");
    }
    void quality(){
        System.out.println("quality is good and long lasting wooden");
    }
}
