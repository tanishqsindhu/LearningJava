package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
       // number.add("Tanishq");
        number.add(3);
        number.add(4);
        number.add(5);
        doubleNumber(number);
    }
    public static void doubleNumber(ArrayList<Integer> numbers){
        for(Integer i : numbers ){
            System.out.println(i*2);
        }
    }
}
