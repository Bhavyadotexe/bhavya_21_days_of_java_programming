package com.bhavya.java.prommimg.series.set2;

import java.util.Scanner;

public class FindTheQuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int firstNumber= scanner.nextInt();
        System.out.println("Enter the second Number");
        int secondNumber = scanner.nextInt();
        scanner.close();
        System.out.println("The Quotient is : " + firstNumber/secondNumber);
        System.out.println("The Remainder is : " + firstNumber%secondNumber);
    }
}
