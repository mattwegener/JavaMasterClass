package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class AreaCalculator {

    public static double area(double radius){
        if(radius < 0) return -1;
        return (Math.PI *radius * radius);
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0) return -1;
        return (x*y);
    }

}

class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.println("Invalid Value");
        else {
            long years, hours, days;
            hours = minutes / 60;
            days = hours / 24;
            years = days / 365;
            days %= 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}

class IntEqualityPrinter {
    public static void printEqual(int in1, int in2, int in3){
        if(in1<0 || in2<0 || in3<0) System.out.println("Invalid Value");
        else if((in1==in2) && (in2==in3)) System.out.println("All numbers are equal");
        else if((in1!=in2) && (in1!=in3) && (in2!=in3)) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}

class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temp){
        if(summer && (temp < 25 || temp > 45)){
            return false;
        }
        return summer || (temp >= 25 && temp <= 35);
    }
}