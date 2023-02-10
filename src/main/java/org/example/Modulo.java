package main.java.com.basic.practice;

public class Modulo {
    public static void main(String[] args) {
        int x = 1234321;
        int y=0;
        while(x!=0) {
            y = y * 10 + x % 10;
            x = x % 10;

            System.out.println(y);
            if (x == y) {
                System.out.println("palindrome");
            } else {
                System.out.println("not a palindrome");
            }
        }
    }
    }

