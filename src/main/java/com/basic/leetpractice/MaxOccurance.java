

//How to find the maximum occurring character in a given String
package com.basic.leetpractice;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurance {
    static void count(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
        for (char s1 : c) {
            if (countMap.containsKey(s1)) {
                countMap.put(s1, countMap.get(s1) + 1);
            } else {
                countMap.put(s1, 1);
            }
        }
            for (Map.Entry entry : countMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }


    public static void main(String[] args) {
        String s1 = "Akash";
        count(s1);
    }
}


