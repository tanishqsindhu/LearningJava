package com.company;

public class Main {

    public static void main(String[] args) {
	getGreatestCommonDivisor(25,15);
    }
    public static int getGreatestCommonDivisor (int first,int second){
        if (first<10||second<10){
            System.out.println("-1");
            return -1;
        }
            while (first != second) {
                if (first > second)
                    first = first - second;
                else {
                    second = second - first;
                }
            }
            return second;
        }
    }
