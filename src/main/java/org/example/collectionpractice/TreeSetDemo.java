package main.java.com.basic.collectionpractice;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t  = new TreeSet(new MyComparator());
        t.add("hjd");
        t.add("sbshs");
        System.out.println(t);
    }

}
