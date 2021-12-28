package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
//        if (score < 5000 && score>1000){
//            System.out.println("Your score was less than 5000");
//        }
//        else if (score < 1000) {
//            System.out.println("Your score is less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        if(gameOver){
            int finalScore = score+(levelCompleted * bonus);
            System.out.println("Your final score was"+ finalScore);
        }
        //int savedFinalScore = finalScore;
        //QS print out a second score on the score with the following
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure the print printout above still displays as well
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver) {
            int secondScore = score + (levelCompleted * bonus);
            System.out.println(secondScore);
        }
    }
}
