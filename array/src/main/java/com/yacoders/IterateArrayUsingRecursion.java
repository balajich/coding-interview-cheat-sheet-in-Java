package com.yacoders;

public class IterateArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //arr.length = 5
     iterateArray(arr, 0);
    }
    public static void iterateArray(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        iterateArray(arr, index+1);
    }
}
