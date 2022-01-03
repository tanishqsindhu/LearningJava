package com.company;

public class Main {

    public static void main(String[] args) {
	hasTeen(9,99,19);
    }
    public static boolean hasTeen(int num1,int num2,int num3){
        if (num1>=13&&num1<=19||num2>=13&&num2<=19||num3<=19&&num3>=13){
         return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int num1){
        if (num1<=19&&num1>=13){
            return true;
        }else{
            return false;
        }
    }
}
