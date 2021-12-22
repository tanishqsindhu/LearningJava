package com.company;

public class Main {

    public static void main(String[] args) {
	double myFirstValue = 20.00,mySecondValue = 80.00;
        System.out.println(myFirstValue+mySecondValue*100.00);
        double myRemainder = (myFirstValue+mySecondValue*100.00)%40;
        System.out.println(myRemainder);
        boolean remainder = myRemainder==0?true:false;
        if (!remainder){
            System.out.println("Got some remainder");
        }
    }
}
