package com.yacoders;

//Find an element in an array using recursion


public class FindAnElementInArrayUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3}; //arr.length = 3
        System.out.println(find(arr,0,2));//true
        System.out.println(find(arr,0,-2));//false
    }

    private static boolean find(int [] arr,int index, int key){
        if(arr[index]==key){ //if the element is equal to the key
           return true;
        }else if(index==arr.length-1) { //if we reached the last element in the array
            return false;
        }else{
            return find(arr,index+1,key); //check the next element in the array
        }
    }
}
