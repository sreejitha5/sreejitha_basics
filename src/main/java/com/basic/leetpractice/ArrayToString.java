
/*qns based on strings and basic steps and techniques to solve string based problems*/
//Qn 1:
package com.basic.leetpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// we can use append();,join();,Stream ,toString();
public class ArrayToString {
    public static void main(String[] args) {
        //input string
        String[] a = {"a", "b", "c"};
        //first method
        String str = Arrays.stream(a).collect(Collectors.joining());
        System.out.println(str);
        //second method
        List<String> sList = Arrays.asList(a);
        StringBuffer stringBuffer = new StringBuffer();
        for (String s : sList) {
            stringBuffer.append(s);

    }

        System.out.println(stringBuffer);


}
}
