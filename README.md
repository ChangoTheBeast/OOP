# OOP
OOP stands for ***Object Oriented Programming*** which is a form of programming language that is designed to model the real world. It achieves this through the use of Classes and Objects.

Classes are essentially blueprints that contain the variables and methods required by the object.
The variables determine the state, and the methods determine the behaviour of the object.

Objects are instances of the respective class. The object then be used by the program for its methods and/or its variables.

OOP has 4 key pillars that it is designed around. They are the following:
  - Encapsulation
  - Polymorphism
  - Abstraction
  - Inheritance

These pillars dictate how to structure your program to keep the code clean and ensure that you avoid repeating code where possible.

## Encapsulation
Encapsulation means that our classes must be structured such that variables inside the class cannot be accessed outside the class directly. This ensures that the variables cannot be changed to illegal values (e.g setting an age to negative).

To ensure that the variables can still be accessed and changed (within reason) from outside the class, **Setters** and **Getters** must be defined inside the class. These are public methods that allow the variable to be set or retrieved respectively.

### Example:
```java
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
  }
```
In this example, the ```numberOfWheels``` variable is set to ```private``` which prevents it from being accessed outside of the ```Vehicle``` class. The **Getter** ```getNumberOfWheels``` is public to allow for the variable to be accessed, and the **Setter** ```setNumberOfWheels``` is public to allow for the variable to be changed. The **Setter** has an additional clause inside of it to ensure the value provided is acceptable.

## Polymorphism
Polymorphism means "*Many Forms*". This is where methods can be **Overwridden** or **Overloaded** allowing one object to take many forms. This usually happens between parent and child classes, though can happen within the same class.

Polymorphism has two notable forms:
 - Static Polymorphism
 - Dynamic Polymorphism

Static Polymorphism refers to the overloading of methods inside one class where as Dynamic Polymorphism typically refers to the overwriding of the methods between classes.

### Examples:
 #### Static Polymorphism:
 ```java
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
 ```
 In this example, the method ```print``` has been **Overloaded** 3 times. This allows for the method to take different forms depending on the type of input specified.

 #### Dynamic Polymorphism:
 ```java
 public abstract class Vehicle {
     private int numberOfWheels;
     private String model;

     public Vehicle(int numberOfWheels, String model) {
        this.numberOfWheels = numberOfWheels;
        this.model = model;
    }

    public abstract String flyable();
 }
 public class Car extends Vehicle {
    public Car(int numberOfWheels, String model) {
        super(numberOfWheels, model);
    }

    @Override
    public String flyable() {
        return "Cars cannot fly.";
    }
}
public class Plane extends Vehicle {
    public Plane(int numberOfWheels, String model) {
        super(numberOfWheels, model);
    }
    @Override
    public String flyable() {
        return "Planes are able to fly (hopefully)";
    }
}
 ```
