package com.bhavya.java.prommimg.series.set2;

import java.util.Scanner;

public class FindThePerimeterOfTheCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        scanner.close();
        System.out.println("The Perimeter of the circle is : " + 2*Math.PI*radius);

    }
}
