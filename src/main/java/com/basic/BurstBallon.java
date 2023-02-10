
/*You are given n balloons, indexed from 0 to n - 1. Each balloon is painted with a number on it represented by an array nums. You are asked to burst all the balloons.

        If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i + 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as if there is a balloon with a 1 painted on it.

        Return the maximum coins you can collect by bursting the balloons wisely.*/

package com.basic;
import java.util.Arrays;
public class BurstBallon {
    public static int maxCoins(int[] A, int N) {

        // Add Bordering Balloons
        int[] B = new int[N + 2];
        B[0] = B[N + 1] = 1;

        for (int i = 1; i <= N; i++)
            B[i] = A[i - 1];

        // Declaring DP array
        int[][] dp = new int[N + 2][N + 2];

        for (int length = 1;
             length < N + 1; length++) {
            for (int left = 1;
                 left < N - length + 2; left++) {
                int right = left + length - 1;

                // For a sub-array from indices
                // left, right. This innermost
                // loop finds the last balloon burst
                for (int last = left;
                     last < right + 1; last++) {
                    dp[left][right] = Math.max(
                            dp[left][right],
                            dp[left][last - 1] +
                                    B[left - 1] * B[last] *
                                            B[right + 1] +
                                    dp[last + 1][right]);
                }
            }
        }
        return dp[1][N];
    }

    // Driver code
    public static void main(String args[]) {
        int[] A = { 3,1,5,8};

        // Size of the array
        int N = A.length;

        // Calling function
        System.out.println(maxCoins(A, N));

    }
}