package com.bhavya.java.prommimg.series.set1;
/*
* how to check number is even or odd: num%2==0
* */

import java.util.Scanner;

public class ToCheckNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        scanner.close();

        if (num%2==0){
            System.out.println(num + " number given  by user is even");
        } else
            System.out.println(num +" number given  by user is odd");
    }
}
