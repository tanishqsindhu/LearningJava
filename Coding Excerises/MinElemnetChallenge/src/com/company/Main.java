package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//        The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//        Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//        In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//        Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//         Finally, print the minimum element in the array.
        System.out.println(findMin(readElements(readInteger())));
    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        return length;
    }
    private static int[] readElements(int length){
        Scanner scanner = new Scanner(System.in);
        int[] myIntArray = new int[length];
        for (int i=0;i<myIntArray.length;i++){
            int element = scanner.nextInt();
            myIntArray[i]=element;
        }
        return myIntArray;
    }
    private static int findMin(int array[]){
        int minElement=Integer.MAX_VALUE;
        boolean minElementFound=true;
        for (int i =0 ;i< array.length;i++){
            if (array[i]<minElement){
                minElement = array[i];
            }
        }
        return minElement;
    }
}

