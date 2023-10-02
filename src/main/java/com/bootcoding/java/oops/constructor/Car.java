package com.bootcoding.java.oops.constructor;

public class Car {
   String brand;
  // boolean airbag;
   String fuelType;
   int seats;

   public Car(){
       System.out.println("default constructor");
   }
    public Car(String b){
        System.out.println(" print brand name");
        brand="Audi";
        print();
    }
    public Car(String b,String f){
        System.out.println(" print brand and fuel type");
        brand="audi";
        fuelType="petrol";
        print();
    }
    public Car(String b, String f,int s){
        System.out.println("print brand ,fuel type and no of seats");
        brand="audi";
        fuelType="petrol";
        seats=s;
        print();
    }
    public void print(){
        System.out.println(brand);
        System.out.println(fuelType);
        // System.out.println(airbag);
        System.out.println(seats);
    }
    public static void main(String[] args) {
        Car c = new Car();
        Car c2 = new Car("Audi");
        Car c3 =new Car("Audi", "petrol",5);
        Car c4 = new Car("Audi","petrol",5);
    }

}

