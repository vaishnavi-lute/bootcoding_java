package com.bootcoding.java.exceptionHandling;

public class Test {
    //using throw throws exception handling keyword
    void division(int a,int b)throws ArithmeticException
    {
        if (b==0){
            throw new ArithmeticException();
        }
        else {
            int c= a/b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.division(20,0);
    }
}
