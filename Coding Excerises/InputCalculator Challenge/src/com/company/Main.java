package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum=0,count=0;
        while(true){
            System.out.println("Enter Number");
            boolean isNumber = scanner.hasNextInt();
            if(isNumber){
                int number = scanner.nextInt();
                sum+=number;
                count++;
            }else{
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
        scanner.close();
    }
}
