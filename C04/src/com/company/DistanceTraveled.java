package com.company;

/*
DISTANCE TRAVELED
C04/PC02

The distance a vehicle travels can be calculated as follows:
        Distance=Speed*Time
For example, if a train travels 40 miles-per-hour for three hours, the distance traveled is 120 miles. Write a
program that asks for the speed of a vehicle (in miles-per-hour) and the number of hours it has traveled. It
should use a loop to display the distance a vehicle has traveled for each hour of a time period specified by
the user. For example, if a vehicle is traveling at 40 mph for a three-hour time period, it should display a report
similar to the one that follows:

A table illustrates the formula distance = speed times and reads as follows.
Row 1. Hour, 1. Distance Traveled, 40.
Row 2. Hour, 2. Distance Traveled, 80.
Row 3. Hour, 3. Distance Traveled, 120.

Input Validation: Do not accept a negative number for speed and do not accept any value less than 1 for time
traveled.
 */

import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        int speed, time;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter vehicle speed (in mph): ");
            speed = input.nextInt();
            // if (speed < 0) {
            // System.out.println("Invalid input: speed cannot be less than 0.");
            // }
        } while (speed < 0);

        do {
            System.out.print("Enter time traveled (in hrs): ");
            time = input.nextInt();
            // if (time < 1) {
            // System.out.println("Invalid input: time cannot be less than 1.");
            // }
        } while (time < 1);

        System.out.println("Hour\tDistance Traveled");
        System.out.println("--------------------------");

        for (int i = 1; i <= time; i++) {
            System.out.println(i + "\t\t" + (speed * i));
        }
    }
}


/*
Enter vehicle speed (in mph): 65
Enter time traveled (in hrs): 5
Hour	Distance Traveled
--------------------------
1		65
2		130
3		195
4		260
5		325

Process finished with exit code 0
 */
