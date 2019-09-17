package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count <=10){
            System.out.println("Enter number #"+count+":");
            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }
            else System.out.println("Invalid Number");
            scanner.nextLine(); //handle return
        }

        System.out.println("Sum of inputs is: " + sum);
        scanner.close();

    }
}

class InputCalculator {
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg;
        while(true){
            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            }
            else break;
            scanner.nextLine(); //handle return
        }
        avg = (double)sum / (double)count;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        scanner.close();

    }
}
