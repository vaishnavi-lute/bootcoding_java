package com.bootcoding.java.string;

public class FirstHalfOfString {
    public static void main(String[] args) {
        String input = "vaishnavi";
        char[] chars2= input.toCharArray();
        int n= chars2.length;
        int str=0;
        str = n/2;
        String Substring = input.substring(0,str);
        System.out.println("print first half of given string: " + Substring);
    }

}

