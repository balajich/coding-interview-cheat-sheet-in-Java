package com.yacoders;

public class IterateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //arr.length = 5
        //Iterate over the array using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //Iterate over the array using for-each loop
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
