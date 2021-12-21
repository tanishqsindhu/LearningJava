package com.company;

public class Main {

    public static void main(String[] args) {
	byte myByteNumber = 126;
    short myShortNumber = 3267;
    int myIntegerNumber = 7548975;
    long myLongTotal = 50000L + 10L*(myByteNumber+myShortNumber+myIntegerNumber);
        System.out.println(myLongTotal);
    }
}
