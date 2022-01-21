package com.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        //return super.startEngine();
        return "Holden -> engine starts.";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerates.";
    }

    @Override
    public String brake() {
        return "Holden -> brakes.";
    }
}
