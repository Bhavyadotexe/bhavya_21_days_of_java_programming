package com.bhavya.java.prommimg.series.set1;

import java.util.Scanner;

public class ToCheckCharacterIsVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = scanner.next().charAt(0);
        scanner.close();

        boolean isVowel = false;


        switch (c) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;

        }

        if (isVowel) {
            System.out.println(c + " is a vowel");
        } else {
            System.out.println(c + " is not s vowel");
        }


    }
}