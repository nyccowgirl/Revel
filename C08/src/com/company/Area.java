package com.company;

/*
AREA CLASS
C08/PC01

Write a class that has three overloaded static methods for calculating the areas of the following geometric shapes:
        - circles
        - rectangles
        - cylinders

Here are the formulas for calculating the area of the shapes.
        - Area of a circle:         Area=πr2, where π is 𝙼𝚊𝚝𝚑.𝙿𝙸 and r is the circle′s radius
        - Area of a rectangle:      Area=Width×Length
        - Area of a cylinder:       Area=πr2h, where π is 𝙼𝚊𝚝𝚑.𝙿𝙸, r is the radius of the cylinder′s base, and
                                    h is the cylinder′s height

Because the three methods are to be overloaded, they should each have the same name, but different parameter lists.
Demonstrate the class in a complete program.
 */

public class Area {

    public static void main(String[] args) {
	    // area of a circle
        System.out.printf("The area of a circle with a radius of 5 is %,.2f\n", getArea(5.0));

        // area of a rectangle
        System.out.printf("The area of a rectangle with a length of 5 and width of 5 is %,.2f\n", getArea(5, 5));

        // area of a cylinder
        System.out.printf("The area of a cylinder with a radius of 5 and height of 5 is %,.2f\n", getArea(5.0, 5.0));
    }

    /**
     * Calculates the area of a circle.
     * @param radius size of radius
     * @return area of a circle
     */

    public static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2.0);
    }

    /**
     * Calculates the area of a rectangle
     * @param length size of length
     * @param width size of width
     * @return area of a rectangle
     */

    public static double getArea(int length, int width) {
        return length * width;
    }

    /**
     * Calculates the area of a cylinder
     * @param radius size of radius
     * @param height size of height
     * @return area of a cylinder
     */

    public static double getArea(double radius, double height) {
        return Math.PI * Math.pow(radius, 2.0) * height;
    }
}

/*
The area of a circle with a radius of 5 is 78.54
The area of a rectangle with a length of 5 and width of 5 is 25.00
The area of a cylinder with a radius of 5 and height of 5 is 392.70

Process finished with exit code 0
 */
