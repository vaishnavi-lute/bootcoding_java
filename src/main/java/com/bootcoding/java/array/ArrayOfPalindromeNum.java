package com.bootcoding.java.array;

public class ArrayOfPalindromeNum {
        public static boolean isPalindrome(int arr[]) {
            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - 1 - i]) {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,3,2,1};
            boolean ans = isPalindrome(arr);
            if (ans) {
                System.out.println("palindrome array");
            } else {
                System.out.println("not an palindrome array");
            }
        }
    }
