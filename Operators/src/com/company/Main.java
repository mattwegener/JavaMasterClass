package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        int prevResult = result;
        result = result - 1; //2
        result = result * 10; //20
        result = result / 5; //4
        result = result % 3; //1

        result++; //result = result + 1;
        ++result; //3
        result--; //2
        --result; //1

        result += 2; //3
        result *= 10; //30
        result /= 3; //10
        result -= 2; //8
        //result %= 4; //0

        System.out.println("result = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("Not an alien!");
            System.out.println("Im scured of aliens :(");
        }

        int topScore = 80;
        if(topScore < 100) System.out.println("You got the high score!");

        int secondScore = 60;
        if(topScore > secondScore && topScore < 100) System.out.println("Greater than 2nd and less than 100");

        int newVal = 50;
        if(newVal == 50){
            System.out.println("we gucci");
        }

        boolean isCar = false;
        if(isCar) System.out.println("why");

        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("Was a car");
        }

        double value1 = 20.00;
        double value2 = 80.00;
        double cResult = 100*(value1 + value2);
        cResult %= 40;
        boolean isZero = (cResult == 0) ? true : false;
        System.out.println(isZero);
        if(!isZero) System.out.println("Got some remainder");



    }
}
