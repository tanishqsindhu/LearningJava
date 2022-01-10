package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count=1,sum=0;
        Scanner scanner = new Scanner(System.in);
        while (count<=10){
            System.out.println("Enter number#"+count);

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                scanner.nextLine(); // handle next line character (enter key)
                    sum+=number;
                    count++;
            } else {
                    System.out.println("Invalid Number");
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
