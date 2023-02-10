package main.java.com.basic.practice;



public class Maximum {
    public static void main(String[] args) {
        int[] a = {80, 90, 60, 40};
        int size = a.length;
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];

                System.out.println(max);
            }
        }
    }
}