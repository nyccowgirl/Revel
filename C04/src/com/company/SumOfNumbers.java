package com.company;

/*
SUM OF NUMBERS
C04/PC01

Write a program that asks the user for a positive nonzero integer value. The program should use a loop to get the sum
of all the integers from 1 up to the number entered. For example, if the user enters 50, the loop will find the sum of
1, 2, 3, 4, ... 50.
 */

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
	    int number, total = 0;
	    Scanner input = new Scanner(System.in);

	    do {
	        System.out.print("Enter a positive nonzero number: ");
	        number = input.nextInt();
        } while (number <= 0);

	    for (int i = 1; i <= number; i++) {
	        total += i;
        }

	    System.out.println("The total of the numbers from 1 to " + number + " is: " + total);
    }
}


/*
Enter a positive nonzero number: 50
The total of the numbers from 1 to 50 is: 1275

Process finished with exit code 0
 */
