package com.bootcoding.java.exceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);

            int b[] = {10, 20, 30, 40, 50};
            System.out.println(b[5]);

            String s = null;
            System.out.println(s.toUpperCase());
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println(f);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception c) {
            System.out.println("null can't be casted in upper case");
        }
        System.out.println("code ended");
    }
}