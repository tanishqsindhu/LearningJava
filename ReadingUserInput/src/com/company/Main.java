package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Date of Birth");
        int date = scanner.nextInt();
        System.out.println("Your Age is "+(2022-date));
        scanner.nextLine();//For handling enter key
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        System.out.println("Your Name is "+ name);
        scanner.close();
        System.out.println("Your Name is "+ name+" Your Age is "+(2022-date));
    }
}
