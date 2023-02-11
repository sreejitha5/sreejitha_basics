

//remove all duplicates from a given string
package com.basic.leetpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    static void remove(String s){
        StringBuilder builder = new StringBuilder();
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for(char c: chars) {
            if (set.add(c)) {
                builder.append(c);

            }
            else{
               System.out.println(c);
            }
        }
            System.out.println(builder.toString());





    }
    public static void main(String[] args) {
        String str = "Sreejitha";
        remove(str);

    }
}
