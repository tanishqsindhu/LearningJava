package com.company;

public class Main {

    public static void main(String[] args) {
	isCatPlaying(true,10);
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if (summer){
            if(temperature>=25&&temperature<=45){
                return true;
            }
        }else if(temperature>=25&&temperature<=35){
                return true;
        }
            return false;
    }
}
