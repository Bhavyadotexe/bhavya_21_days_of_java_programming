package com.bhavya.java.prommimg.series.set2;

import java.util.Scanner;

public class FindTheAverageOfNumber {
    public static void main(String[] args) {

        // reading the array size
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Array Size");
        int size = scanner.nextInt();
        //Create an array
        int[] array = new int[size];

        // reading values from user keyboard
        System.out.println("Enter array values : ");
        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            array[i] = value;
        }
        //getting array length
           int length = array.length;

        //default sum value
           int sum = 0;

           //sum of all values in array using for loop
           for (int i = 0; i < array.length; i++){
               sum += array[i];
           }
           double average = sum / length;
            System.out.println("Average of number is " + average);
    }
}
