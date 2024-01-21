package com.yacoders;

//Find the maximum element in an array
public class FindMaxElementInArray {
    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 2, 3, 4, 5})); //5
    }

    public static int max(int[] arr) {
        int max = arr[0]; //assume the first element is the max
        for (int element : arr) { //loop through the array
            if (element > max) { //if the element is greater than the max
                max = element; //set the max to the element
            }
        }
        return max; //return the max
    }
}
