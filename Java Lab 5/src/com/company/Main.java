package com.company;

public class Threadone extends Thread {
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args){
        Threadone t=new Threadone();
        t.start();
    }
}


