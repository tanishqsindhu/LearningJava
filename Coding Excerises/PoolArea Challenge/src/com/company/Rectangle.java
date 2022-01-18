package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if (length<0){
           this.length=0;
       }else{
            this.length = length;
       }if (width<0){
           this.width = 0;
       }else {
            this.width = width;
        }
    }

    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public double getArea(){
        return (getWidth()*getLength());
    }
}
