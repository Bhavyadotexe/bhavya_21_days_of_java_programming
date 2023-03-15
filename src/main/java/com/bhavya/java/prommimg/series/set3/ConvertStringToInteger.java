package com.bhavya.java.prommimg.series.set3;

public class ConvertStringToInteger {
    public static void main(String[] args) {

        String str1 = "21";
        String str2 = "16";
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.valueOf(str2);
        System.out.println("Conversion of string to Integer is: " +num1);
        System.out.println("Conversion of string to integer is: " + (num2*7));


    }
}
