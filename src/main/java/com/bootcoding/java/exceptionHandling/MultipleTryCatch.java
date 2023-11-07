package com.bootcoding.java.exceptionHandling;

public class MultipleTryCatch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        try {
            int x[] = {10,20,30,40};
            System.out.println(x[5]);
        }catch (ArrayIndexOutOfBoundsException f){
            System.out.println("Beyond the array limit");
        }
    }
}
