package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calcScore("One",500);
        System.out.println("New score is " + newScore);
        calcScore(75);
        calcScore();

        double cm = calcFeetInchesToCentimeters(6,2);
        System.out.println("6-2 is " + cm + " cm");

        calcFeetInchesToCentimeters(72);
        String test1 = getDurationString(65,45);
        System.out.println(test1);
        String test2 = getDurationString(3945);
        System.out.println(test2);

    }

    private static int calcScore(String player, int score){
        System.out.println("Player " + player + " scored " + score + " points");
        return score * 1000;
    }

    private static int calcScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    private static int calcScore(){
        System.out.println("No player name, no player score");
        return 0;
    }

    private static double calcFeetInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12) return -1;
        return calcFeetInchesToCentimeters(inches + 12*feet);
    }

    private static double calcFeetInchesToCentimeters(double inches){
        if(inches < 0) return -1;
        System.out.println(inches + " inches is " + ((int)inches/12) + " Feet and " + (int)inches%12 + " inches");
        return 2.54*(inches);
    }

    private static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds >59) return "Invalid Value";

        int hours = minutes / 60;
        int mins = minutes % 60;
        String output1,output2,output3;

        if(hours < 10) output1 = "0" + hours + "h ";
            else output1 = hours +"h ";
        if(mins < 10) output2 = "0" + mins + "m ";
            else output2 = mins +"m ";
        if(seconds < 10) output3 = "0" + seconds + "s";
            else output3 = seconds +"s";

        return output1 + output2 + output3;

    }

    private static String getDurationString(int seconds){
        if(seconds < 0) return "Invalid Value";
        int min, sec;
        min = seconds / 60;
        sec = seconds % 60;
        return getDurationString(min,sec);
    }
}
