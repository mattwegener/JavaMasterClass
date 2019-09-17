package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000;i++){
            if((i%3) == 0 && (i%5)==0){
                sum += i;
                count++;
            }
            if(count == 5) break;
        }
        System.out.println(sum);
    }

    public static void printDayOfWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
