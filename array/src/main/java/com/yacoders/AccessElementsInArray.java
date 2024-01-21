package com.yacoders;

public class AccessElementsInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(arr[0]); //accessing the first element, array index starts from 0
        System.out.println(arr.length); //length of the array
        System.out.println(arr[arr.length-1]); //accessing the last element
    }
}
