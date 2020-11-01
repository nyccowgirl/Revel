package com.company;

/*
PAINT JOB ESTIMATOR
C05/PC04

A painting company has determined that for every 115 square feet of wall space, one gallon of paint and eight hours
of labor will be required. The company charges $18.00 per hour for labor. Write a program that allows the user to
enter the number of rooms to be painted and the price of the paint per gallon. It should also ask for the square feet
of wall space in each room. The program should have methods that return the following data:
        -   The number of gallons of paint required
        -   The hours of labor required
        -   The cost of the paint
        -   The labor charges
        -   The total cost of the paint job

Then it should display the data on the screen.
 */

import java.util.Scanner;

public class PaintJobEstimator {
    public static void main(String[] args) {
        int rooms;
        double cost, gallons, labor, totalPaint, totalLabor, totalSpace = 0;

        rooms = getRooms();
        cost = getPaintPrice();

        for (int i = 0; i < rooms; i++) {
            totalSpace += getWallSpace(i);
        }

        gallons = calcGallons(totalSpace);
        labor = calcLabor(totalSpace);
        totalPaint = calcPaintCost(gallons, cost);
        totalLabor = calcLaborCost(labor);
        System.out.printf("The number of gallons of paint required: %,.2f\n", gallons);
        System.out.printf("The hours of labor required: %,.2f\n", labor);
        System.out.printf("The cost of the paint: $%,.2f\n", totalPaint);
        System.out.printf("The labor charges: $%,.2f\n", totalLabor);
        System.out.printf("The total cost of paint job: $%,.2f\n",(totalLabor + totalPaint));
    }


    /**
     * The getRooms method returns the number of rooms that the user wishes to get painted.
     * @return Number of rooms
     */

    public static int getRooms() {
        int rooms;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the number of rooms to be painted: ");
            rooms = input.nextInt();

            if (rooms < 1) {
                System.out.println("Invalid input: number of rooms cannot be less than 1.");
            }
        } while (rooms < 1);
        return rooms;
    }


    /**
     * The getPaintPrice method returns the cost of a gallon of paint.
     * @return Cost of paint per gallon
     */

    public static double getPaintPrice() {
        double cost;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the cost of a gallon of paint: ");
            cost = input.nextDouble();

            if (cost < 0) {
                System.out.println("Invalid input: cost of paint cannot be less than 0.");
            }
        } while (cost < 0);
        return cost;
    }


    /**
     * The getWallSpace method returns the square footage of a room.
     * @param room Room number
     * @return Square footage of specified room
     */

    public static double getWallSpace(int room) {
        double wallSpace;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the square footage of room " + (room + 1) + ": ");
            wallSpace = input.nextDouble();

            if (wallSpace < 0) {
                System.out.println("Invalid input: square footage of room cannot be less than 0.");
            }
        } while (wallSpace < 0);
        return wallSpace;
    }


    /**
     * The calcGallons method returns amount of gallons of paint needed for the paint job.
     * @param totalSpace Total square footage of paint job
     * @return Total gallons of paint needed for the paint job
     */

    public static double calcGallons(double totalSpace) {
        int sqFtPerGallon = 115;

        return totalSpace / sqFtPerGallon;
    }


    /**
     * The calcLabor method returns the estimated number of hours needed for the paint job.
     * @param totalSpace Total square footage of paint job
     * @return Total labor hours needed for the paint job
     */

    public static double calcLabor(double totalSpace) {
        int laborPerGallon = 8;

        return totalSpace / laborPerGallon;
    }


    /**
     * The calcPaintCost method returns the total cost for paint needed for the paint job.
     * @param gallons Total gallons needed
     * @param cost Price per gallon of paint
     * @return Total paint cost for paint job
     */

    public static double calcPaintCost(double gallons, double cost) {
        return gallons * cost;
    }


    /**
     * The calcLaborCost method returns the total labor cost for the paint job.
     * @param labor Total labor hours needed
     * @return Total labor cost for the paint job
     */

    public static double calcLaborCost(double labor) {
        double wage = 18.00;

        return labor * wage;
    }
}


/*
Enter the number of rooms to be painted: 3
Enter the cost of a gallon of paint: 10
Enter the square footage of room 1: 111
Enter the square footage of room 2: 777
Enter the square footage of room 3: 1500
The number of gallons of paint required: 20.77
The hours of labor required: 298.50
The cost of the paint: $207.65
The labor charges: $5,373.00
The total cost of paint job: $5,580.65

Process finished with exit code 0
 */
