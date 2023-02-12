//How to reverse the words in a given String sentence
package com.basic.leetpractice;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class WordReverse {
    static void reverseWord(String s){
        List< String> w = Arrays.asList(s.split("\\s"));
        //Collections.reverse(w);
StringBuffer sc = new StringBuffer();
for (int i = w.size() - 1; i >= 0; i--)
{
    sc.append(w.get(i));
    sc.append(' ');
}

        System.out.println( sc.toString().trim());


    }
    public static void main(String[] args) {
        reverseWord("reverse the word in string");
    }
}
