package com.basic.leetpractice;

import java.util.HashSet;
import java.util.Set;

public class NonRepeat {
    public static void main(String[] args) {
        String s = "java";
        StringBuffer sb = new StringBuffer();
        char[]  chars= s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char c:chars){
            if(set.add(c)){
            sb.append(c);
            break;
        }
        System.out.println(sb.toString());
        System.out.println(sb.substring(0,1) );
        }
    }