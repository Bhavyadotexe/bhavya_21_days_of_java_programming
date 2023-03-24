package com.hashmap.coding;

import java.util.ArrayList;
import java.util.Iterator;

public class CreatedTheArrayList {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<String>();
        colorList.add("blue");
        colorList.add("yellow");
        colorList.add("pink");
        colorList.add("white");

        System.out.println("\n----------Using For Each Loop-----------");
        for (String color: colorList){
            System.out.println(color);
        }

        System.out.println("\n------------Using Iterator------------");
        Iterator<String> itr = colorList.iterator();
        while (itr.hasNext()) {
            String color = (String) itr.next();
            System.out.println(color);
        }

        System.out.println("\n-------Using for loop------");

        for (int i=0; i<colorList.size(); i++){
            System.out.println(colorList.get(i));
        }

    }
}
