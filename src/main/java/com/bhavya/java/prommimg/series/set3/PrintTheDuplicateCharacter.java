package com.bhavya.java.prommimg.series.set3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintTheDuplicateCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scanner.next();
        char[] ca = str.toCharArray();
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        for (Character c:ca){
            if (m.containsKey(c)) {
                m.put(c,m.get(c)+1);
            } else {
                m.put(c,1);
            }
        }

        System.out.println("The Duplicates Characters are:" +m);
    }
}
