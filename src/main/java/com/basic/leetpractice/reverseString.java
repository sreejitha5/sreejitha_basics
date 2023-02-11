package com.basic.leetpractice;

public class reverseString {
    static void rvrs(String s){

       StringBuffer sb = new StringBuffer(s);
       System.out.println( sb.reverse());
        char[] ch= s.toCharArray();
        String str = new String();
        for(int i =s.length()-1;i>=0;i--){
            str = str+  ch[i];

        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        rvrs("work");
    }
}
