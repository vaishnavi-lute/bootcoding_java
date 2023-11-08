package com.bootcoding.java.collection.arraylist;

import java.util.ArrayList;

public class TrimArraylist {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList(10);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        System.out.println(arrayList);
        arrayList.trimToSize();
        System.out.println( "the element of this array :" + arrayList);
    }
}
