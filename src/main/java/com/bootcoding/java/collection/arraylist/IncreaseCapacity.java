package com.bootcoding.java.collection.arraylist;

import java.util.ArrayList;

public class IncreaseCapacity {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("20");
        arr.add("40");
        arr.add("60");
        arr.add("80");
        System.out.println(arr);

        arr.ensureCapacity(50);
        System.out.println("Increase the capacity to 50 :" + arr);
    }
}
