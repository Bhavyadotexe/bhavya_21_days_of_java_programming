package com.bhavya.java.prommimg.series.set2;

import java.util.Scanner;

public class FIndThePowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
       int number =  scanner.nextInt();
       int initialNumber = number;
        System.out.println("Enter the power");
        int power = scanner.nextInt();
        scanner.close();
        for(int i=1; i<power; i++){
            number = number*initialNumber;
        }
        System.out.println(number);
    }
}
