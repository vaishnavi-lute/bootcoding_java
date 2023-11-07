package com.bootcoding.java.exceptionHandling;

public class TryCatchFinally {

    public static void main(String[] args) {

        try{
            System.out.println("Learn coding");
            int a = 10;
            int b = 2;
            int c;
            c=a/b;

            System.out.println(c);
            System.out.println("output of this program is " + c);
        }
        catch (Exception e){
            System.out.println("Can't divide by zero");
        }
       finally {
            System.out.println("Last step of this program");
        }
        System.out.println("main method ended");
    }
}
