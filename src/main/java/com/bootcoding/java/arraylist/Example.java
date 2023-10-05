package com.bootcoding.java.arraylist;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
    ArrayList<Integer> num = new ArrayList<>();
    num.add(10);
    num.add(20);
    num.add(30);

    for(int i = 0; i<num.size(); i++){
        System.out.println(num.get(i));
    }
    }
}
