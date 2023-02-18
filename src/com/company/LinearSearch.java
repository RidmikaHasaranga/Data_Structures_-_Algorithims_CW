package com.company;

public class LinearSearch {

    public static int search(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array = {62,89,32,67,21,39,88,55,94};
        System.out.println("89 index: " + search(array,89));
        System.out.println("55 index: " + search(array,55));
        System.out.println("69 index: " + search(array,69));
    }
}
