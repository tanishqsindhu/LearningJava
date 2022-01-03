package com.company;

public class Main {

    public static void main(String[] args) {
	int newScore = calculateScore("Tanishq",1000);
        System.out.println("New Goals are" + newScore);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player"+playerName+"scored"+score);
        return score*1000;
    }
}
