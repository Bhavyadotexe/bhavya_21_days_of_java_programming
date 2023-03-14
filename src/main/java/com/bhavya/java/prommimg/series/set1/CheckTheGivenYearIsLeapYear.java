package com.bhavya.java.prommimg.series.set1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckTheGivenYearIsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year : ");
       int year =  scanner.nextInt();
       scanner.close();
       boolean isLeapYear = false;
       if (year%4==0){
           if(year%100 == 0){
               if (year%400==0){
                   isLeapYear = true;
               } else {
                   isLeapYear = false;
               }
           }else
           {
               isLeapYear = true;
           }
       } else{
           isLeapYear = false;
       }
       if(isLeapYear){
           System.out.println("Given year is leap year");
       }else {
           System.out.println("Given year is not leap year");
       }
    }
}

