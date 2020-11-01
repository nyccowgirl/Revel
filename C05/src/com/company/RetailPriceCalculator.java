package com.company;

/*
RETAIL PRICE CALCULATOR
C05/PC02

Write a program that asks the user to enter an item’s wholesale cost and its markup percentage. It should then display
the item’s retail price. For example:
    -   If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent, then the item’s retail price is
        10.00.
    -   If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent, then the item’s retail price is
        7.50.

The program should have a method named calculateRetail that receives the wholesale cost and the markup percentage as
arguments, and returns the retail price of the item.
 */

import java.util.Scanner;

public class RetailPriceCalculator {
    public static void main(String[] args) {
        double wholesale, markup;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the wholesale price: ");
        wholesale = input.nextDouble();
        System.out.print("Enter the markup percentage (e.g., 50 for 50%): ");
        markup = input.nextDouble() / 100;
        System.out.printf("The retail price is $%,.2f.\n", calculateRetail(wholesale, markup));

    }


    /**
     * The calculateRetail method returns the retail price for the item.
     * @param wholesale Wholesale price of item
     * @param markup Markup percentage of item
     * @return Retail price of item
     */

    public static double calculateRetail(double wholesale, double markup) {
        return (wholesale * (1 + markup));
    }
}


/*
Enter the wholesale price: 5
Enter the markup percentage (e.g., 50 for 50%): 100
The retail price is $10.00.

Process finished with exit code 0

Enter the wholesale price: 5
Enter the markup percentage (e.g., 50 for 50%): 50
The retail price is $7.50.

Process finished with exit code 0
 */