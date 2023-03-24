package com.hashmap.coding;

import java.util.HashSet;
import java.util.Set;

public class CreatedTheHashSet {
    public static void main(String[] args) {
        Set<String> colorSet = new HashSet<String>();
      System.out.println(colorSet.add("purple"));
        System.out.println(colorSet.add("blue"));
        System.out.println(colorSet.add("blue"));
        System.out.println(colorSet.add("white"));

        System.out.println(colorSet);
    }
}
