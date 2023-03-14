package com.bhavya.java.prommimg.series.set1;
/*
* print multiplicationTable : number1*number2
*  */

import java.util.Scanner;

public class PrintTheMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        scanner.close();
        for(int i=0;i<=10;i++){
            System.out.println(number + "X"+ i + "=" + number*i );
        }
    }
}
