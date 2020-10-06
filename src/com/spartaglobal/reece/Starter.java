package com.spartaglobal.reece;

public class Starter {
    public void start() {
        Printer printer = new Printer();
        Car car = new Car(4, "Suzuki Swift");
        Plane plane = new Plane(4, "Boeing 747");
        printer.print("This is a sentence.");
        printer.print(car);
        printer.print(plane);
        printer.print(car.flyable());
        printer.print(plane.flyable());
    }
}
