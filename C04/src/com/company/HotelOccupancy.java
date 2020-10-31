package com.company;

/*
HOTEL OCCUPANCY
C04/PC07

A hotel’s occupancy rate is calculated as follows:
            Occupancy rate=Number of rooms occupied ÷ Total number of rooms
Write a program that calculates the occupancy rate for each floor of a hotel. The program should start by asking for
the number of floors in the hotel. A loop should then iterate once for each floor. During each iteration, the loop
should ask the user for the number of rooms on the floor and the number of them that are occupied. After all the
iterations, the program should display the number of rooms the hotel has, the number of them that are occupied, the
number that are vacant, and the occupancy rate for the hotel.

Input Validation: Do not accept a value less than 1 for the number of floors. Do not accept a number less than 10
for the number of rooms on a floor.
 */

import java.util.Scanner;

public class HotelOccupancy {

    public static void main(String[] args) {
        int floors, rooms, occupiedRooms, totalRooms = 0, totalOccupied = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter the number of floors in the hotel: ");
            floors = input.nextInt();

            if (floors < 1) {
                System.out.println("Invalid input: number of floors can not be less than 1.");
            }

        } while (floors < 1);

        for (int i = 1; i <= floors; i++) {
            System.out.println("Floor " + i);
            System.out.println("--------");

            do {
                System.out.print("Enter the number of rooms: ");
                rooms = input.nextInt();

                if (rooms < 10) {
                    System.out.println("Invalid input: number of rooms can not be less than 10.");
                }
            } while  (rooms < 10);

            totalRooms += rooms;

            do {
                System.out.print("Enter the number of occupied rooms: ");
                occupiedRooms = input.nextInt();

                if (occupiedRooms > rooms || occupiedRooms < 0) {
                    System.out.print("Invalid input: occupied rooms can not be less than 0 or greater than ");
                    System.out.println("the number of rooms on the floor.");
                }
            } while (occupiedRooms > rooms || occupiedRooms < 0);

            totalOccupied += occupiedRooms;

        }

        System.out.println("HOTEL STATISTICS");
        System.out.println("----------------");
        System.out.println("Total rooms: " + totalRooms);
        System.out.println("Total occupied: " + totalOccupied);
        System.out.println("Total vacant: " + (totalRooms - totalOccupied));
        System.out.printf("Occupancy rate: %.2f%%", (totalOccupied * 100.0/ totalRooms));
    }
}


/*
Enter the number of floors in the hotel: 3
Floor 1
--------
Enter the number of rooms: 2
Invalid input: number of rooms can not be less than 10.
Enter the number of rooms: 10
Enter the number of occupied rooms: 2
Floor 2
--------
Enter the number of rooms: 15
Enter the number of occupied rooms: 8
Floor 3
--------
Enter the number of rooms: 20
Enter the number of occupied rooms: 11
HOTEL STATISTICS
----------------
Total rooms: 45
Total occupied: 21
Total vacant: 24
Occupancy rate: 46.67%
Process finished with exit code 0
 */
