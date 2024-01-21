package com.yacoders;

//Find the maximum element in an array using recursion
public class FindMaxElementInArrayUsingRecursion {
    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 2, 3, 4, 5}, 0)); //5
    }

    public static int max(int[] arr, int index) {
        if (index == arr.length - 1) { //if we reached the last element in the array
            return arr[index]; //return the last element
        } else {
            return Math.max(arr[index], max(arr, index + 1)); //return the max between the current element and the next element
        }
    }

}
