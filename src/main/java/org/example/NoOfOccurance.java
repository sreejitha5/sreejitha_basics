package main.java.com.basic.practice;

import java.util.ArrayList;

//count the no of occurance of duplicate character  in given string
public class NoOfOccurance {
    public static void main(String[] args) {
        String str = new String("Sreekash");
        int count = 1;
        char[] ch = str.toCharArray();
        ArrayList<Character> characterList = new ArrayList<Character>();
        for (int i = 0; i < ch.length; i++) {
            if (!characterList.contains(ch[i])) {
                characterList.add(ch[i]);
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        count++;
                    }
                }
                System.out.println(ch[i] + ": " + count);
                count=1;
            }

        }

    }
}


