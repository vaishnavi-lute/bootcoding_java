package com.bootcoding.java.collection.arraylist;

import java.util.ArrayList;

public class EmptyArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(4,5);
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());

    }
}
