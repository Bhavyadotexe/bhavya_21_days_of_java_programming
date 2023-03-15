package com.hashmap.coding;

import java.util.HashMap;

public class CreatingHashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> colorMap = new HashMap<Integer,String>();
        System.out.println(colorMap.put(1, "Green"));
        System.out.println(colorMap.put(2,"Red"));
        System.out.println(colorMap.put(3,"Magenta"));
        System.out.println(colorMap.put(3,"white"));
        System.out.println(colorMap.put(4,"blue"));
        System.out.println(colorMap.put(5,"black"));

    }
}

