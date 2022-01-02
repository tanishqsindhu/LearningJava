package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
        int playerScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",playerScore);
        playerScore = calculateHighScorePosition(900);
        displayHighScorePosition("Tim2",playerScore);
        playerScore = calculateHighScorePosition(400);
        displayHighScorePosition("Tim3",playerScore);
        playerScore = calculateHighScorePosition(50);
        displayHighScorePosition("Tim4",playerScore);
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

        //Create a method called displayHighScorePosition
        //it should a players name as a parameter, and 2nd parameter as a position in the high score table
        //You should display the players name along with a message like "managed to get into position"and the position they got and a further message "on the high score table".

        //Create a 2nd method called calculateHighScorePosition
        //it should be sent one argument only, the player score
        //it should return an int
        //the return data should be
        //1 if the score is >1000
        //2 if the score is >500 and <1000
        //3 if the score is >100 and <500
        //4 in all other cases
        //call both methods and display the result of the following
        //a score of 1500, 900, 400, and 50
        //
    }
    public static void displayHighScorePosition(String playerName,int playerPosition){
        System.out.println(playerName+" managed to get into position "+playerPosition+" on the high score table");
    }
        public static int calculateHighScorePosition(int playerScore){
            if(playerScore>=1000){
                return 1;
            }else if(playerScore>=500){
                return 2;
            }else if(playerScore>=100){
                return 3;
            }
            return 4;

            //      Or
//            int playerPosition = 4;
//            if(playerScore>=1000){
//                playerPosition =1;
//            }else if(playerScore>=500){
//                playerPosition =2;
//            }else if(playerScore>=100){
//                playerPosition=3;
//            }
//            return playerPosition;
        }
}
