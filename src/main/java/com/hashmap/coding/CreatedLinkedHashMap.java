package com.hashmap.coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CreatedLinkedHashMap {
    public static void main(String[] args) {

        HashMap<Integer, Student> studentMap1 = new HashMap<Integer, Student>();
        studentMap1.put(1, new Student("s1", 101));
        studentMap1.put(4, new Student("s4", 104));
        studentMap1.put(3, new Student("s3",103));

        LinkedHashMap<Integer, Student> studentMap2 = new LinkedHashMap<Integer, Student>();
        studentMap2.put(5, new Student("s5", 105));
        studentMap2.put(7, new Student("s7", 107));
        studentMap2.put(9, new Student("s9", 109));
        studentMap2.put(3, new Student("s3", 103));


        System.out.println("\n--------- Student Map 1---------(HashMap)");
        for(Map.Entry<Integer, Student> entry : studentMap1.entrySet()){
            System.out.println(" Key =  " + entry.getKey() + " Value = " + entry.getValue());
        }

        System.out.println("\n---------Student map 2--------(LinkedHashMap)");

        for (Map.Entry<Integer, Student > entry : studentMap2.entrySet()){

            System.out.println("Key =  " + entry.getKey() + " Value = "  + entry.getValue());
        }



    }
}
