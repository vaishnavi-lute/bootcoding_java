package com.bootcoding.java.oops.interfaces;

public class Mobile implements Shop {

    @Override
    public void colour() {
        System.out.println("Colour is: Ocean blue");
    }

    @Override
    public void price() {
        System.out.println("Price is: 16,000");
    }

    @Override
    public void model() {
        System.out.println("Model name: Redmi note 9 pro max");
    }

    @Override
    public void ramRom() {
        System.out.println("Ram and Rom: 6GB and 128GB");
    }

    @Override
    public void Accessories() {
        System.out.println("Accessories: Cover and Charger");
    }
}
