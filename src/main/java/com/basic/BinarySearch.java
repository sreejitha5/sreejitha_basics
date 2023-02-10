package com.basic;
public class BinarySearch {
    public static void main(String[] args) {
        int[] n = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//array should be sorted
        int key = 80;
        boolean flag = false;
        int m;//element for binary search
        //defining the first and last index of sorted array
        int l = 0; //l means lowest
        int h = n.length - 1;//h means highest
        while (l <= h) {
            //if l>h then a value doesnt exists
            m = (l + h) / 2;
            if (n[m] == key) {
                System.out.println("element found");
                flag = true;
                break;
            }
            if (n[m] < key) {
                l = m + 1;
            }
            if (n[m] > key) {
                h = m - 1;
            }
        }
        if (flag == false) {
            System.out.println("not found");
        }
    }
}








