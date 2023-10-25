package com.bootcoding.java.oops.polymorphism.overloading;

import java.util.Date;

public class HumanExercise {
    private Date date;
    private int time;
    //method overloading
    //1.running now for 15 minutes
    public void run(){
        date = new Date();
        time = 15;

    }
    public void run(int time){
        date = new Date();
       this.time=time;
    }
    public void run(int mon,double f,float d){

//       date = new Date();
//       time = 35;
    }
    public void run(float mon,double f,int d){

//        date = new Date();
//        time = 25;

    }
    public int run(int mon,float f,double d){
        this.date = new Date();
        this.time = mon;
        return 1;
    }
    public void print(){
        System.out.println("Running for "+ time + "min at" + date);
    }
}
