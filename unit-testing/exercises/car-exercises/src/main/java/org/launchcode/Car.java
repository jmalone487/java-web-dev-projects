package org.launchcode;

public class Car {

    private String make;
    private String model;
    private double gasTankLevel;
    private double gasTankSize;
    private double milesPerGallon;

    // Constructor
    public Car(String make, String model, double gasTankSize, double milesPerGallon) {
        this.make = make;
        this.model = model;
        this.gasTankSize = gasTankSize;
        this.gasTankLevel = gasTankSize;  // Assume the tank is full when a new car is created
        this.milesPerGallon = milesPerGallon;
    }

    // Drive method reduces gasTankLevel based on miles driven
    public void drive(double miles) {
        double gasUsed = miles / milesPerGallon;
        if (gasUsed > gasTankLevel) {
            gasTankLevel = 0;  // If gas is insufficient for the miles, set gasTankLevel to 0
        } else {
            gasTankLevel -= gasUsed;
        }
    }

    // Add gas method, throws exception if adding gas exceeds the tank size
    public void addGas(double gas) {
        if (gas + this.gasTankLevel > this.gasTankSize) {
            throw new IllegalArgumentException("Can't exceed tank size");
        }
        this.setGasTankLevel(gas + this.gasTankLevel);
    }

    // Set gas tank level, throws exception if it exceeds the tank size
    public void setGasTankLevel(double gasTankLevel) {
        if (gasTankLevel > this.gasTankSize) {
            throw new IllegalArgumentException("Can't exceed tank size");
        }
        this.gasTankLevel = gasTankLevel;
    }

    // Getters for gasTankLevel, gasTankSize, and milesPerGallon
    public double getGasTankLevel() {
        return gasTankLevel;
    }

    public double getGasTankSize() {
        return gasTankSize;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    // Getters for make and model
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
