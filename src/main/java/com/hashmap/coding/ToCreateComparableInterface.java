package com.hashmap.coding;

import java.util.ArrayList;
import java.util.Collections;

public class ToCreateComparableInterface {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(21);
        intList.add(16);
        intList.add(7);
        intList.add(5);
        intList.add(19);

        System.out.println("\n--------Before Sorting---------");
        intList.forEach(System.out::println);

        Collections.sort(intList);

        System.out.println("\n--------After Sorting-------");
        intList.forEach(System.out::println);

        ArrayList<String> strcolor = new ArrayList<String>();
        strcolor.add("green");
        strcolor.add("yellow");
        strcolor.add("white");
        strcolor.add("blue");

        System.out.println("\n--------Before sorting---------");
        strcolor.forEach(System.out::println);


        System.out.println("\n--------After sorting---------");
        Collections.sort(strcolor);
        strcolor.forEach(System.out::println);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Mayur",21));
        studentList.add(new Student("Bhawana", 16));
        studentList.add(new Student("Tashvi", 27 ));
        studentList.add(new Student("Krishita", 21));

        System.out.println("\n------Before Sorting------");
        studentList.forEach(System.out::println);


    }
}
