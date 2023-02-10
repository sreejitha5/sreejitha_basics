package com.basic.collectionpractice;
import  java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MyProject {
    //student data project given by akash
    public static void main(String[] args) {
        List<Student> lt = new ArrayList<Student>();
        lt.add(new Student(1, "akash"));
        lt.add(new Student(2, "ishu"));
        lt.add(new Student(3, "sree"));
        lt.add(new Student(4, "srishti"));
        Map<Integer, String> map = new HashMap<>();
        for (Student s : lt) {
            map.put(s.getiD(), s.getname());
        }
        {
            System.out.println(map);
            map.get(1);
            System.out.println(map.get(2));
        }
    }
}










