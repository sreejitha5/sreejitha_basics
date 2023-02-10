package com.basic;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
public class Target {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int t = 9;
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {

                if (nums[i] + nums[j] == t) {
                    System.out.println(i+" "+j);
                }

            }

        }
    }
}
