package com.company;

public class Vehicle {
    private int currentVelocity;
    private String name;
    private String size;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection=0;
        this.currentVelocity =0;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" degrees.");
    }
    public void move(int velocity,int direction){
        this.currentVelocity=velocity;
        this.currentDirection =direction;
        System.out.println("Vehicle.move(): Moving at "+ currentVelocity+" in direction "+ currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
    public void stop(){
        this.currentVelocity=0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
