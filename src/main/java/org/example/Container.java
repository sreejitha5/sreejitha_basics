package main.java.com.basic.practice;
/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

        Find two lines that together with the x-axis form a container, such that the container contains the most water.

        Return the maximum amount of water a container can store.

        Notice that you may not slant the container.*/

public class Container {
    public static void main(String[] args) {
        int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int Area = 0;
        int l = h.length;
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                Area = Math.max(
                        Area, Math.min(h[i], h[j]) *
                                (j - i));

            }


        }

    }
}




