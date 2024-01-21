package com.yacoders;

//Find an element in a sorted array using custom binary search
public class FindAnElementInSortedArrayUsingCustomBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; //arr.length = 5
        //using custom binary search
        int index = binarySearch(arr, 5); //index = 4
        if (index >= 0) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0; //index of the first element
        int high = arr.length - 1; //index of last element
        int mid; //index of middle element
        int index = -1; //index of key or element to find
        while (low <= high) { //loop until low is less than or equal to high
            mid = (low + high) / 2; //find the middle element
            if (key == arr[mid]) { //if key is equal to a middle element
                index = mid; //set index to mid
                break; //break the loop
            } else if (key < arr[mid]) { // search in left half
                high = mid - 1; //
            } else { // search in right half
                low = mid + 1;
            }
        }
        return index; //return index of key or element to find
    }


}
