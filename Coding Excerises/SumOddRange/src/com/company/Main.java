package com.company;

public class Main {

    public static void main(String[] args){
    sumOdd(1,100);
    }
    public static boolean isOdd(int number){
        if (number>0){
            if(number%2!=0){
                return true;
            }
        }
            return false;
    }
    public static int sumOdd(int start,int end){
        int sum=0;
        if (start<0||end<0||end<start) {
          return -1;
        }
        for (int i=start; i<=end; i++) {
            if (isOdd(i)){
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
