package com.hashmap.coding;
/*
* Using for-each loop
* Using Iterator
* */
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreatingEntries {
    public static void main(String[] args) {
        HashMap<Integer,String> colorMap = new HashMap<>();
        colorMap.put(1,"white");
        colorMap.put(2,"pink");
        colorMap.put(3,"yellow");
        colorMap.put(3,"black");
        colorMap.put(4,"green");
        colorMap.put(5,"blue");

        System.out.println("----------by using for loop---------");
        for (Map.Entry<Integer, String> entry : colorMap.entrySet()){
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
        System.out.println("------by using for Iterator------------- ");

        Iterator<Map.Entry<Integer, String>> itr = colorMap.entrySet().iterator();
        while (itr.hasNext()){

            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }

        System.out.println("--------by using for each loop--------");

        colorMap.forEach((k,v) -> System.out.println("key = " + k  + "value = " + v ));

        System.out.println("----------Iterating over key-----------");

        for (Integer key: colorMap.keySet()) {
            System.out.println("key:" + key);  

        }

        System.out.println("-----------------Iterating over values--------");
        for (String value: colorMap.values()){
            System.out.println("value:" + value);

        }
    }
}
