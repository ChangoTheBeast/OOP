package com.spartaglobal.reece;

public class Plane extends Vehicle{
    public Plane(int numberOfWheels, String model) {
        super(numberOfWheels, model);
    }
    @Override
    public String flyable() {
        return "Planes are able to fly (hopefully)";
    }
}
