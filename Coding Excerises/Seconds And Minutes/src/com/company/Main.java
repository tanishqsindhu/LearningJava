package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getDurationString(int minutes,int seconds) {
        if (minutes<0||seconds<0||seconds>59){
            System.out.println("Invalid Value");
        }
        int hours = minutes/60;
        System.out.println(hours+"h "+minutes+"m "+seconds+"s");
        return 0;
    }
    public static int getDurationString(int seconds){
        if (seconds<0){
            System.out.println("Invalid Value");
            return -1;
        }
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        return getDurationString(minutes,remainingSeconds);
    }
}
