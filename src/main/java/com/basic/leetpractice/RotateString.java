// check if strings are rotations of each other in Java
/*
Here is the exact algorithm to check if a given String is a rotation of another:

1) check the length of two strings, if the length is not the same then return false
2) concatenate given string to itself
3) check if the rotated version of String exists in this concatenated string
4) if yes, then the second String is a rotated version of the first string


 */
package com.basic.leetpractice;

public class RotateString {
    static void checkRotate(String s, String a){
        //1) check the length of two strings, if the length is not the same then return false
      if (s.length()==a.length()){
          //2) concatenate given string to itself
          String concat = s+s;
          //3) check if the rotated version of String exists in this concatenated string
          if(concat.indexOf(a) !=-1){
              //4) if yes, then the second String is a rotated version of the first string
              System.out.println("this is a rotated string");
          }

      }
      else{
          System.out.println("Strings are not equal length");
      }


    }
    public static void main(String[] args) {
    checkRotate("abcd","bcda");
    }
}
