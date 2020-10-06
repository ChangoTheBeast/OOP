package com.spartaglobal.reece;

public class Printer {
    public void print(Car car) {
        System.out.println("This car is a " + car.getModel() + ".");
    }
    public void print(Plane plane) {
        System.out.println("This plane is a " + plane.getModel() + ".");
    }
    public void print(String s) {
        System.out.println(s);
    }
}
