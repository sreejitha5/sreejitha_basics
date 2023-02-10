package com.basic.leetpractice;

public class MethodsForEqualStrings {
    public static void main(String[] args) {
        String s1 = "Sree";
        String s2 = "sree";

        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
