package com.bootcoding.java.multipleInheritanceusingInterface;

public class SmartphoneApp {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.getNetworks();
        String[] ar = smartphone.getNetworks();
        for (String item:ar ){
            System.out.println(item);
            smartphone.connectToTheNetwork("airtel");
            smartphone.takeSnap();
            smartphone.callNumber(727612);
            smartphone.pickCall();
        }
    }
}
