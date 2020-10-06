package com.spartaglobal.reece;

public class Car extends Vehicle {
    public Car(int numberOfWheels, String model) {
        super(numberOfWheels, model);
    }

    @Override
    public String flyable() {
        return "Cars cannot fly.";
    }
}
