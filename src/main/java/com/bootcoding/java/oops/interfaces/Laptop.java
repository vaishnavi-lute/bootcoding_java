package com.bootcoding.java.oops.interfaces;

public class Laptop implements Shop{

    @Override
    public void colour() {
        System.out.println("Colour : Matte Black");
    }

    @Override
    public void price() {
        System.out.println("Price : 55,000/-");
    }

    @Override
    public void model() {
        System.out.println("Model : Lenovo IdeaPad Gaming");
    }

    @Override
    public void ramRom() {
        System.out.println("Ram and Rom : 6GB and 256GB");
    }

    @Override
    public void Accessories() {
        System.out.println("Accessories : Laptop bag and Charger");
    }
}
