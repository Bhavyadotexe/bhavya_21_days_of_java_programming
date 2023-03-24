package com.hashmap.coding;

import java.util.ArrayList;

public class PractiseOnArrayList {
    public static void main(String[] args) {
        ArrayList<String > colorList1 = new ArrayList<String>();
        colorList1.add("Orange");
        colorList1.add("white");
        colorList1.add("peach");
        colorList1.add("purple");

        ArrayList<String> colorList2 = new ArrayList<String>();
        colorList2.add("Blue");
        colorList2.add("pink");
        colorList2.add("Green");

        System.out.println("\n--------color list1----------");

        for (String  color: colorList1){
            System.out.println(color);
        }

        System.out.println("\n-------colorList2-----------");
        for (String color: colorList2){
            System.out.println(color);
        }
        colorList1.addAll(colorList2);
        System.out.println("\n---------Color List 1 After addAll()---------");

        for (String color : colorList1){
            System.out.println(color);
        }

        colorList1.removeAll(colorList2);
        System.out.println("\n----------color List 2 after RemoveAll()----------");
        for (String color: colorList1){
            System.out.println(color);
        }

        colorList1.addAll(colorList2);
        System.out.println("\n---------Color List 1 After addAll()---------");

        for (String color : colorList1){
            System.out.println(color);
        }

        colorList1.retainAll(colorList2);
        System.out.println("\n---------Color List 2 after RetainAll()----------");
        for (String color: colorList2){
            System.out.println(color);
        }
    }
}
