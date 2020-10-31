package com.company;

/*
SQUARE DISPLAY
C04/PC20

Write a program that asks the user for a positive integer no greater than 15. The program should then display a square
on the screen using the character ‘X’. The number entered by the user will be the length of each side of the square.
 */

import java.util.Scanner;

public class SquareDisplay {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number between 1 and 15: ");
            num = input.nextInt();

            if (num < 1 || num > 15) {
                System.out.print("Invalid input: number has to be between 1 and 15.");
            }
        } while (num < 1 || num > 15);

        for (int i = 0; i < num; i++) {
            for (int x = 0; x < num; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
Enter a number between 1 and 15: 5
*****
*****
*****
*****
*****

Process finished with exit code 0

Enter a number between 1 and 15: 8
********
********
********
********
********
********
********
********

Process finished with exit code 0
 */
