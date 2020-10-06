package com.spartaglobal.reece;

public abstract class Vehicle {
    private int numberOfWheels;
    private String model;

    public Vehicle(int numberOfWheels, String model) {
        this.numberOfWheels = numberOfWheels;
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        if (numberOfWheels < 0) {
            System.err.println("Please provide a valid number of wheels.");
        } else {
            this.numberOfWheels = numberOfWheels;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract String flyable();
}
