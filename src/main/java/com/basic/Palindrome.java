package com.basic;
//Given an integer x, return true if x is a palindrome, and false otherwise.
public class Palindrome {
    public static void main(String[] args) {
        int x = 1234321;
        String sx = String.valueOf(x);
        StringBuffer sf = new StringBuffer(sx);
        System.out.println(x);
        System.out.println(sf.reverse());
        int reverse = Integer.valueOf(String.valueOf(sf));
        if(reverse==x){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}
