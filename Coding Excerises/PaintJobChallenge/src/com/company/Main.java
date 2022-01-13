package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	getBucketCount(3.4,2.1,1.5,2);
    }
    public static int getBucketCount(double width,double height,double areaPerBucket,double extraBucket){
            if(width<=0||height<=0||areaPerBucket<=0||extraBucket<0){
                System.out.println("Invalid Value");
                return -1;
            }
            return (int) Math.ceil((((width*height)/areaPerBucket)-extraBucket));

    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            System.out.println("Invalid Value");
            return -1;
        }
        return (int) Math.ceil(((width*height)/areaPerBucket));
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            System.out.println("Invalid Value");
            return -1;
        }
        return (int) Math.ceil((area/areaPerBucket));
    }
}
