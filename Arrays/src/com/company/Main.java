package com.company;

public class Main {

    public static void main(String[] args) {
	int [] myIntArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[9]);
        int[] myIntArray2 = new int[10];
        for (int i =0;i<myIntArray2.length;i++){
            myIntArray2[i]=i*10;
        }
        int [] myIntArray3= new int[10];
        myIntArray3[0]=45;
        myIntArray3[5]=476;
        myIntArray3[9]=79;
        System.out.println(myIntArray3[0]);
        System.out.println(myIntArray3[5]);
        System.out.println(myIntArray3[9]);
        printArray(myIntArray2);
    }
    public static void printArray(int[]array){
        for (int i =0;i<array.length;i++){
            array[i]=i*10;
            System.out.println(i);
        }
    }
}
