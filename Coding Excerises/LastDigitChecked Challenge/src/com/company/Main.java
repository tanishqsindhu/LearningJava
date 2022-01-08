package com.company;

public class Main {

    public static void main(String[] args) {
	hasSameLastDigit(41,22,71);
    isValid(10);
    }
    public static boolean hasSameLastDigit(int x,int y,int z){
        if (x<10||x>1000||y<10||y>1000||z<10||z>1000){
            return false;
        }
        if (x%10==y%10||y%10==z%10||x%10==z%10){
            System.out.println(true);
            return true;
        }
        return false;
    }
    public static boolean isValid(int num){
        if (num<10||num>1000){
            return false;
        }
        System.out.println(true);
        return true;
    }
}
