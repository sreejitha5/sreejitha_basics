package main.java.com.basic.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {


        List<String> ll = Arrays.asList("john","paul","bose");
       String l= ll.stream().collect(Collectors.joining("$"));
        System.out.println(l);

    }
}
