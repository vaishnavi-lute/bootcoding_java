package com.bootcoding.java.exceptionHandling;

import java.util.concurrent.ExecutionException;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            System.out.println("Null can't be casted");
        }
    }
}
//here you have to declare any string like names for output, null can not be converted in uppercase.