package com.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> engine starts.";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerates.";
    }

    @Override
    public String brake() {
        return "Ford -> brakes.";
    }
}
