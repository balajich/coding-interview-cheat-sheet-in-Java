package com.yacoders;

//Find an element in an array
public class FindAnElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3}; //arr.length = 3
        System.out.println(find(arr,2));//true
        System.out.println(find(arr,-2));//false
    }

    private static boolean find(int [] arr, int key){
        boolean found=false;
        for(int element: arr){ //for each element in the array
            if(element==key){ //if the element is equal to the key
                found=true;
                break; //exit the loop
            }
        }
        return found;
    }
}
