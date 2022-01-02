package com.company;

public class Main {
    public static void main(String[] args) {
        double kilometersPerHour = 1.5;
        System.out.println(toMilesPerHour(kilometersPerHour));
        printConversion(kilometersPerHour);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }
            return Math.round(kilometersPerHour/1.609344);
    }
    public static void printConversion(double kilometersPerHour){
        System.out.println(kilometersPerHour+"km/h = "+toMilesPerHour(kilometersPerHour)+"mi/h");
    }
}
