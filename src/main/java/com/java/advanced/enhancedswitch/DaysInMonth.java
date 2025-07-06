package com.java.advanced.enhancedswitch;

import java.time.Month;
import java.time.Year;

// Enhanced switch introduced in java 14
public class DaysInMonth {

    //older way of implementing switch statement
    public static int getDays(Month month, int year){
        int noOfDays = 0;
        switch(month){
            case SEPTEMBER:
            case APRIL:
            case JUNE:
            case NOVEMBER:
                noOfDays = 30;
                break;
            case FEBRUARY:
                System.out.println("checking if "+year+" is a leap year");
                noOfDays = Year.isLeap(year)? 29: 28;
                break;
            default:
                noOfDays = 31;
        }
        return noOfDays;
    }


    public static int getDaysV2(Month month, int year){
        return switch (month){
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
            //case FEBRUARY -> Year.isLeap(year)? 29 : 28;
            case FEBRUARY -> {
                System.out.println("Check if year is = "+year+" is a leap year");
                yield Year.isLeap(year)?29:28;
            }
            default -> 31;
        };
    }

    // for the input we are using in below switch expression 'month' we have covered all possible scenarios
    // so we can avoid default statement. This is exhaustive nature of enhanced switch.

    public static int getDaysV3(Month month, int year){
        return switch (month){
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
            //case FEBRUARY -> Year.isLeap(year)? 29 : 28;
            case FEBRUARY -> {
                System.out.println("Check if year is = "+year+" is a leap year");
                yield Year.isLeap(year)?29:28;
            }
            case JANUARY, MARCH, MAY, JULY , AUGUST , OCTOBER, DECEMBER -> 31;
           // default -> 31;
        };
    }

    public static void main(String[] args) {

        System.out.println(" getDays V2========"+getDaysV2(Month.APRIL, 2023));
    }
}
