package com.hashmap.coding;

import java.util.TreeSet;

public class ToCreateTheTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> intSet = new TreeSet<Integer>();
        intSet.add(8);
        intSet.add(2);
        intSet.add(9);
        intSet.add(7);

        System.out.println("\n----------Integer TreeSet-------");
        intSet.forEach(System.out::println);

        TreeSet<String> strSet = new TreeSet<String>();
        strSet.add("Mayur");
        strSet.add("Bhavana");
        strSet.add("Kandalkar");

        System.out.println("\n-----------String Tree Set-----------");
        strSet.forEach(System.out::println);



    }
}
