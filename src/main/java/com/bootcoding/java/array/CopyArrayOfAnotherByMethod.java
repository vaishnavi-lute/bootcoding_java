package com.bootcoding.java.array;

public class CopyArrayOfAnotherByMethod {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
         copyArray(arr);
    }

    public static void copyArray(int arr[]) {
        int n = arr.length;
        System.out.println("print original array  ");
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("copy of another array: " + n );
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}