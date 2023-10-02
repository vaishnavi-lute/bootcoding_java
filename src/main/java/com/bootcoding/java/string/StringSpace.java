package com.bootcoding.java.string;

public class StringSpace {
    public static void main(String[] args) {
    String input = "java"; //j a v a
        char[] chars2 = input.toCharArray();
        for (int i=0; i<chars2.length; i++){
            System.out.print(chars2[i] + " ");
        }
    }
}
