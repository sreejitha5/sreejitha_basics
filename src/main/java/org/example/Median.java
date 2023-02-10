/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

       The overall run time complexity should be O(log (m+n)).*/
package main.java.com.basic.practice;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};//length = n
        int[] nums2 = new int[]{3};//length = m
        //new merged array length = n+m
        int n = nums1.length + nums2.length;//add the length of firstArray into secondArray
        int[] mergedArray = new int[n];    //resultant array
        int pos = 0;
        for (int element : nums1) //copying elements of secondArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;              //increases position by 1
        }
        for (int element : nums2) //copying elements of firstArray using for-each loop
        {
            mergedArray[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(mergedArray));   //prints the resultant array
        int m = 0;

        if (n % 2 == 1){
            m = mergedArray[(n + 1) / 2 - 1];}
         else {
            m = (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2;
        }

        System.out.println("Median :" + m);
    }
}


