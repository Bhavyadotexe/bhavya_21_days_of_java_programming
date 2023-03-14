package com.bhavya.java.prommimg.series.set1;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        scanner.close();
        System.out.println("The Sum of " + firstNumber + " and " + secondNumber + " is :" + (firstNumber + secondNumber));
    }
}
