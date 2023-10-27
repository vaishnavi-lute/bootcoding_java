package com.bootcoding.java.oops.interfaces;

public class ShopApp {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
       mobile.model();
       mobile.colour();
       mobile.price();
       mobile.ramRom();
       mobile.Accessories();

        Laptop laptop = new Laptop();
        laptop.model();
        laptop.colour();
        laptop.price();
        laptop.ramRom();
        laptop.Accessories();
    }
}
