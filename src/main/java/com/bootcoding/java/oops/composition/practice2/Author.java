package com.bootcoding.java.oops.composition.practice2;

public class Author {
    private int Age;
    private String name;
    public String authorSignature;
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }
}
