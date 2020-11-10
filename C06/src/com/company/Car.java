package com.company;

/*
CAR CLASS
C06/PC02

Write a class named Car that has the following fields:
    - yearModel. The yearModel field is an int that holds the car’s year model.
    - make. The make field references a String object that holds the make of the car.
    - speed. The speed field is an int that holds the car’s current speed.

In addition, the class should have the following constructor and other methods.
    - Constructor. The constructor should accept the car’s year model and make as arguments. These values should be
    assigned to the object’s yearModel and make fields. The constructor should also assign 0 to the speed field.
    - Accessors. Appropriate accessor methods should get the values stored in an object’s yearModel, make, and speed
    fields.
    - accelerate. The accelerate method should add 5 to the speed field each time it is called.
    - brake. The brake method should subtract 5 from the speed field each time it is called.

Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. After
each call to the accelerate method, get the current speed of the car and display it. Then call the brake method five
times. After each call to the brake method, get the current speed of the car and display it.
 */

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    Car(int year, String inMake) {
        yearModel = year;
        make = inMake;
        speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }

    public static void main(String[] args) {
        int times = 5;
        Car auto = new Car(2011, "Volvo");

        for (int i = 0; i < 5; i++) {
            auto.accelerate();
            System.out.println("Accelerate Speed: " + auto.getSpeed());
        }

        for (int i = 0; i < 5; i++) {
            auto.brake();
            System.out.println("Brake Speed: " + auto.getSpeed());
        }
    }
}


/*

Accelerate Speed: 5
Accelerate Speed: 10
Accelerate Speed: 15
Accelerate Speed: 20
Accelerate Speed: 25
Brake Speed: 20
Brake Speed: 15
Brake Speed: 10
Brake Speed: 5
Brake Speed: 0
 */
