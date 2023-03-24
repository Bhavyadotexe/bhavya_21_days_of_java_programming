package com.hashmap.coding;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PractiseOnHashSet {

    public static void main(String[] args) {

        Set<Student> studentSet1 = new HashSet<Student>();
        studentSet1.add(new Student("s1", 101));
        studentSet1.add(new Student("s2", 102));
        studentSet1.add(new Student("s4",104));
        studentSet1.add(new Student("s3",103));
        studentSet1.add(new Student("s4",104));

        LinkedHashSet<Student>  studentSet2 = new LinkedHashSet<>();
        studentSet2.add(new Student("s6", 106));
        studentSet2.add(new Student("s9",109));
        studentSet1.add(new Student("s9", 109));
        studentSet2.add(new Student("s8", 108));

        System.out.println("\n--------StudentSet1---------");
        studentSet1.forEach(System.out::println);

        System.out.println("\n--------StudentSet2---------");
        studentSet2.forEach(System.out::println);

        System.out.println("\n-----------ada all()---------");
        studentSet1.addAll(studentSet2);
        studentSet1.forEach(System.out::println);

        System.out.println("\n----------remove all()--------");
        studentSet1.removeAll(studentSet2);
        System.out.println(studentSet1);

        System.out.println("\n----------retain all()--------");
        studentSet1.retainAll(studentSet2);
        System.out.println(studentSet1);

        System.out.println("\n--------contain()-------------");
        System.out.println(studentSet1.contains(new Student ("s3", 103)));

        System.out.println("\n----------containAll()----------");
        System.out.println(studentSet2.containsAll(studentSet2));





    }
}

