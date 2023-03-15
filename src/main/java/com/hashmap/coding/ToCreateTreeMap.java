package com.hashmap.coding;

import java.util.Map;
import java.util.TreeMap;

public class ToCreateTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer, String> intMap = new TreeMap<Integer,String>();
        intMap.put(1,"acb");
        intMap.put(3,"xyz");
        intMap.put(4,"pqr");
        intMap.put(2,"ghi");

        System.out.println("\n--------Treemap---------");
        for (Map.Entry<Integer, String> entry : intMap.entrySet()){
            System.out.println("Key = " + entry.getKey() +  " value = " + entry.getValue());
        }

        TreeMap<String, String> strMap = new TreeMap<String, String>();
        strMap.put("W","qwe");
        strMap.put("m","abc");
        strMap.put("w","xpf");
        strMap.put("B","yrt");

        for (Map.Entry<String, String> entry : strMap.entrySet()){

            System.out.println("Key = " + entry.getKey() + " value = " + entry.getValue() );
        }

    }
}
