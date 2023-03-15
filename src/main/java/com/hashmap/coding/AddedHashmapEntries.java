package com.hashmap.coding;


import java.util.HashMap;
import java.util.Map;

public class AddedHashmapEntries {
    public static void main(String[] args) {

        HashMap<Integer, Student> studentMap1 = new HashMap<Integer, Student>();
        studentMap1.put(1,new Student("s1", 101));
        studentMap1.put(2, new Student("s2", 102));
        studentMap1.put(4, new Student("s4", 104));

        HashMap<Integer, Student> studentMap2 = new HashMap<Integer, Student>();
        studentMap2.put(4, new Student("s4", 104));
        studentMap1.put(6, new Student("s6", 106));
        studentMap2.put(7, new Student("s7", 107));

        System.out.println("\n-------Student Map 1----------");
        for(Map.Entry<Integer, Student> entry : studentMap1.entrySet()){
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }

        System.out.println("\n-------Student Map 2----------");
        for (Map.Entry<Integer, Student> entry : studentMap2.entrySet()){
            System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue());
        }

        studentMap1.putAll(studentMap2);

        System.out.println("\n---------Student Map1 after studentMap1.putAll(studentMap2)------- ");

        for (Map.Entry<Integer, Student> entry : studentMap1.entrySet()){
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue()) ;
        }

        System.out.println("\n------ContainsKey--------");
        if (studentMap1.containsKey(3)){
            System.out.println("StudentMap1 contains specified key");
        } else {
            System.out.println("studentMap1 does not contains specified key");
        }

        System.out.println("\n---------ContainsValue-------");
        if (studentMap2.containsValue(new Student("S6",106))){

            System.out.println("StudentMap2 contains the specified value");
        } else {
            System.out.println("StudentMap1 contains the specified value");
        }

    }

}
