package com.yacoders;

import java.util.Arrays;

//Find an element in a sorted array using binary search implementation of Arrays class
public class FindAnElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //arr.length = 5
        //using binary search implementation of Arrays class
        int index = Arrays.binarySearch(arr, 5); //index = 4
        if (index >= 0) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }

}
