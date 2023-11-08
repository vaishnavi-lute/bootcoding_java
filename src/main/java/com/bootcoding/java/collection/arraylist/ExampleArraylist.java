package com.bootcoding.java.collection.arraylist;

import com.bootcoding.java.oops.constructor.Student;

import java.util.ArrayList;

public class ExampleArraylist {
    public static void main(String[] args) {

        // The angle brackets(<>) in java are typically referred to as "Diamond Operator".

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);

        //1.add()
        arrayList.add(3);
        arrayList.add(9);
        for (int i = 1; i<=23 ; i++){
            arrayList.add(i);
        }

        arrayList.toString();
        System.out.println(arrayList);

        System.out.println(arrayList.get(5));

        //2.remove
        arrayList.remove(0);

        //3.set()
        arrayList.set(4,90);
        System.out.println(arrayList);

        //4.contains()
        System.out.println(arrayList.contains(12));

        //5.clear()
        arrayList.clear();
        System.out.println(arrayList);

        //6.isEmpty()
        System.out.println(arrayList.isEmpty());
    }
}
//There is one more addFirst() in new 21 version.