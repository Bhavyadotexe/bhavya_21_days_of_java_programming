package com.hashmap.coding;

import java.util.HashSet;
import java.util.Iterator;

public class CreatedCustomClassOfHashSet {
    public static void main(String[] args) {

        HashSet<Student> studentSet = new HashSet<Student>();
        studentSet.add(new Student("S1", 101));
        studentSet.add(new Student("s2", 102));
        studentSet.add(new Student("s2", 102));
        studentSet.add(new Student("s6", 106));
        studentSet.add(new Student("s5", 105));

        System.out.println("\n-------Using for each loop");
        for (Student student : studentSet) {
            System.out.println(student);
        }

        System.out.println("\n-------Using Iterator--------");
        Iterator<Student> itr = studentSet.iterator();
        while (itr.hasNext()) {
            Student student = itr.next();
            System.out.println(student);
        }

            System.out.println("\n---------using forEach-------");
            studentSet.forEach(System.out::println);

        }
    }