package com.basic;

public class RemoveDuplicates extends Study {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 5, 5, 5, 6, 8, 9, 9};
        int n = arr.length;
        n = removeDuplicates(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");


    }
}
