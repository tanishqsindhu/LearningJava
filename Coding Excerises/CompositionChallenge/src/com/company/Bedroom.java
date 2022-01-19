package com.company;

public class Bedroom {
    String name;
    Wall wall1,wall2,wall3,wall4;
    Bed bed;
    Ceiling ceiling;
    Lamp lamp;

    public Bedroom(String name,Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed, Ceiling ceiling, Lamp lamp) {
        this.name=name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.ceiling = ceiling;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        Bed.make();
    }
}
