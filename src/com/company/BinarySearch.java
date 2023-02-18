package com.company;

import java.util.Arrays;

public class BinarySearch {
    public static int binarysearch(int arr[], int l, int r, int x){
        if (r >= l){
            int mid = l + (r - l) / 2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] > x){
                return binarysearch(arr, l,mid - 1, x);
            }
            return binarysearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void insertionSort (int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] array = {62,89,32,67,21,39,88,55,94};
        insertionSort(array);
        System.out.println("Sorted Array" + Arrays.toString(array));
        System.out.println("89 index: " + binarysearch(array,0, array.length-1,89));
        System.out.println("55 index: " + binarysearch(array,0, array.length-1,55));
        System.out.println("69 index: " + binarysearch(array,0, array.length-1,69));
    }
}
