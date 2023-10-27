package com.bootcoding.java.multipleInheritanceusingInterface;

public class Smartphone extends CellPhone implements Camera,Wifi{

    @Override
    public void takeSnap() {
        System.out.println("Taking a picture");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record a video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("getting list of network");
        String[] networklist = {"vaishnavi", "bootcoding"," airtel5G"};
        return networklist;
    }

    @Override
    public void connectToTheNetwork(String Network) {
        System.out.println("Connecting to" +  Network);
    }
}
