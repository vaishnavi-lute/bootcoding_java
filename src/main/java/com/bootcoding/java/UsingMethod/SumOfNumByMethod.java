package com.bootcoding.java.UsingMethod;

import org.w3c.dom.ls.LSOutput;

public class SumOfNumByMethod {
    public static void main(String[] args) {
      int arr[] = {1,2,4,5,6};
      findSumArray(arr);
    }
    public static int[] findSumArray(int[] a){
       for (int i=1; i < a.length; i++){
           a[i]= a[i-1] + a[i];
           System.out.println(a[i]);
       }
       return a;

    }

}
