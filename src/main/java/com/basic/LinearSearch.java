package com.basic;
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int l = a.length;
        int find = 50;
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            if (find == a[i]) {
                System.out.println("element present");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("element not found");
        }
    }
}














