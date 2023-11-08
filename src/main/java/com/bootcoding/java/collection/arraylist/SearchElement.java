package com.bootcoding.java.collection.arraylist;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);

        System.out.println(arrayList.get(5));
    }
}
