package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check ");
        int number= sc.nextInt();
        checkNubmber(number);
    }
    public static void checkNubmber(int number){
        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
