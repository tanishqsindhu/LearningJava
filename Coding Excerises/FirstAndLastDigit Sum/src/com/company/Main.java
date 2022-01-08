package com.company;

public class Main {

    public static void main(String[] args) {
	sumFirstAndLastDigit(252);
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int lastdigit=number%10,firstnumber=0;
        while(number>9) {
            number /= 10;
        }
        int sum=lastdigit+number;
        System.out.println(sum);
        return sum;
    }
}
