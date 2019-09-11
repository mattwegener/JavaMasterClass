package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Matt",1500);
        displayHighScorePosition("Bhav",900);
        displayHighScorePosition("Rob",400);
        displayHighScorePosition("Kyle",50);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int score){

        if(score < 100) return 4;
        else if(score < 500) return 3;
        else if(score < 1000) return 2;

        return 1;

    }

    public static void displayHighScorePosition(String name, int score){
        System.out.println(name + " managed to get into position "
                           + calculateHighScorePosition(score) + " on the highscore table");
    }


}
