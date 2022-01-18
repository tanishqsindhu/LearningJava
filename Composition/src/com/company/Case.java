package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private Dimensions dimensions;
    private String powerSupply;

    public Case(String model, String manufacturer,String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.powerSupply=powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getPowerSupply() {

        return powerSupply;
    }
}
