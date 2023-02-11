
//Remove characters from the first String which are present in the second String
        package com.basic.leetpractice;


public class RemoveEquals {
    static void findEqual(String s ,String a){

        StringBuffer answer= new StringBuffer();
         for(int i = 0 ; i<s.length();i++) {
             int count = 0;
             for (int j = 0; j < a.length(); j++) {
                 if (s.charAt(i) == a.charAt(j)) {
                     count = 1;
                 }
             }
if(count !=1)
    answer.append(s.charAt(i));

         }
        System.out.println(answer.toString());
    }
    public static void main(String[] args) {
         findEqual("sreejitha","th" );
    }
}
