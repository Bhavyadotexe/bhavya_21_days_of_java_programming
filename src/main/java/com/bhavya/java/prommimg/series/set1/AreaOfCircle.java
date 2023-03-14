package com.bhavya.java.prommimg.series.set1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double radius = scanner.nextDouble();
        scanner.close();
        System.out.println("The area of the circle having radius is  " + radius + " : " + (Math.PI*radius*radius));
    }
}
