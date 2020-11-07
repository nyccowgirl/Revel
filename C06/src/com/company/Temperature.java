package com.company;

/*
PAINT JOB ESTIMATOR
C06/PC08

Write a Temperature class that will hold a temperature in Fahrenheit, and provide methods to get the temperature in
Fahrenheit, Celsius, and Kelvin. The class should have the following field:
    fahrenheit – A double that holds a Fahrenheit temperature.

The class should have the following methods:
    Constructor – The constructor accepts a Fahrenheit temperature (as a double) and stores it in the ftemp field.
    setFahrenheit – The setFahrenheit method accepts a Fahrenheit temperature (as a double) and stores it in the ftemp
                field.
    getFahrenheit – Returns the value of the ftemp field, as a Fahrenheit temperature (no conversion required).
    celsius – Returns the value of the ftemp field converted to Celsius.
    kelvin – Returns the value of the ftemp field converted to Kelvin.

Use the following formula to convert the Fahrenheit temperature to Celsius:
    Celsius=(5/9)×(Fahrenheit−32)

Use the following formula to convert the Fahrenheit temperature to Kelvin:
    Kelvin=((5/9)×(Fahrenheit−32)+273)

Demonstrate the Temperature class by writing a separate program that asks the user for a Fahrenheit temperature. The
program should create an instance of the Temperature class, with the value entered by the user passed to the
constructor. The program should then call the object’s methods to display the temperature in Celsius and Kelvin.
 */

import java.util.Scanner;

public class Temperature {
    private double ftemp;

    Temperature(double temp) {
        ftemp = temp;
    }

    public void setFahrenheit(double temp) {
        ftemp = temp;
    }

    public double getFahrenheit() {
        return ftemp;
    }

    public double getCelsius() {
        return ((double)5 / 9) * (ftemp - 32);
    }

    public double getKelvin() {
        return (((double)5 / 9) * (ftemp - 32)) + 273;
    }

    public static void main(String[] args) {
        double userInput;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Fahrenheit temperature:");
        userInput = input.nextDouble();
        Temperature temp = new Temperature(userInput);

        System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
        System.out.println("The temperature in Celsius is " + temp.getCelsius());
        System.out.println("The temperature in Kelvin is " + temp.getKelvin());
    }
}


/*
Enter a Fahrenheit temperature:100
The temperature in Fahrenheit is 100.0
The temperature in Celsius is 37.77777777777778
The temperature in Kelvin is 310.77777777777777

Process finished with exit code 0
 */
