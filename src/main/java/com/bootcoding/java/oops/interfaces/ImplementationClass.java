package com.bootcoding.java.oops.interfaces;

public class ImplementationClass implements Car{
    @Override
    public void average() {
        System.out.println("The average of Thar is 14 - 20kmpl");
    }

    @Override
    public void speedup() {
        System.out.println("Highest speed of the thar is 155km");
    }

    @Override
    public void colour() {
        System.out.println(" Glossy Black is classy colour of Thar");
    }

    @Override
    public void model() {
        System.out.println(" model name is : Mahindra Thar 2.5D 4WD (63 HP)");
    }
}
