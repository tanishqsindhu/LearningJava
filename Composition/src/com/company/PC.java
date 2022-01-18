package com.company;

public class PC {
    private Case theCase;
    private Motherboard theMotherBoard;
    private Monitor theMonitor;

    public PC(Case theCase, Motherboard theMotherBoard, Monitor theMonitor) {
        this.theCase = theCase;
        this.theMotherBoard = theMotherBoard;
        this.theMonitor = theMonitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getTheMotherBoard() {
        return theMotherBoard;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }
}
