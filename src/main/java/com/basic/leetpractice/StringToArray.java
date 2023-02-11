package com.basic.leetpractice;

public class StringToArray {
    public static void main(String[] args) {
        String s = "sreejitha";
        char[] har = s.toCharArray();
        System.out.println(har.length);
        //  copy string char to array
        char[] chars1 = new char[9];
        s.getChars(0, 9, chars1, 0);
        System.out.println(chars1);
        //can solve using hashmap as well


    }
}
