package com.bootcoding.java.oops.constructor;

public class Student {
    int age;
    int percentage;
    String branch;

    public Student(){
        System.out.println("default constructor");
        print();
    }
    public Student(int a){
        age = a;
        System.out.println("print age of student");
        print();
    }
    public Student(int a,int p){
        System.out.println(" print age and percentage of student");
        age = a;
        percentage = p;
        print();
    }
    public Student(int a, int p ,String b){
        System.out.println("print age ,percentage and branch of student");
        age = a;
        percentage = p;
        branch = "Computer Engineering";
        print();
    }
    public void print(){
        System.out.println(age);
        System.out.println(percentage+"%");
        System.out.println(branch );
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(23);
        Student s3 = new Student(23,67);
        Student s4 = new Student(23,67, "Computer Engineering");
    }
}
