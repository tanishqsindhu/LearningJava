package com.company;

public class Main {

    public static void main(String[] args) {
	getEvenDigitSum(12345678);
    }
    public static int getEvenDigitSum(int number){
        int sum=0;
        if (number<0){
            return -1;
        }
        while(number>0){
            int evenNumbers =number%10;
            if (evenNumbers%2==0){
                sum+=evenNumbers;
            }
            number/=10;
        }
        System.out.println(sum);
        return sum;
    }
}
