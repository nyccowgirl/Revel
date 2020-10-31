package com.company;

/*
DISTANCE FILE
C04/PC03

Modify DistanceTraveled to print to file.
 */

import java.util.Scanner;
import java.io.*;

public class DistanceFile {

    public static void main(String[] args) throws IOException {
        int speed, time;
        PrintWriter file = new PrintWriter("distancefile.txt");
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

        file.println("Hour\tDistance Traveled");
        file.println("--------------------------");

        for (int i = 1; i <= time; i++) {
            file.println(i + "\t\t" + (speed * i));
        }

        file.close();
    }
}


/*
Enter vehicle speed (in mph): 65
Enter time traveled (in hrs): 5

Process finished with exit code 0
 */