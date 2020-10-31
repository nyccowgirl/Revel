package com.company;

/*
PENNIES FOR PAY
C04/PC04

Write a program that calculates the amount a person would earn over a period of time if his or her salary is one penny
the first day, two pennies the second day, and continues to double each day. The program should display a table
showing the salary for each day, and then show the total pay at the end of the period. The output should be displayed
in a dollar amount, not the number of pennies.

Input Validation: Do not accept a number less than 1 for the number of days worked.
 */

import java.util.Scanner;

public class PenniesForPay {

    public static void main(String[] args) {
        int pennies = 1, total = 0, day = 1, maxDays;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("How many days do you plan to work? ");
            maxDays = input.nextInt();

            if (maxDays < 1) {
                System.out.println("Invalid input: Days can not be less than 1.");
            }
        } while (maxDays < 1);

        System.out.println("Day\t\tEarned Pennies");
        System.out.println("---\t\t--------------");

        while (day <= maxDays) {
            pennies *= 2;
            System.out.print(day + "\t\t");
            System.out.printf("%,d\n", pennies);
            day++;
        }

        System.out.printf("Total pay: $%,.2f", pennies / 100.0);
    }
}


/*
How many days do you plan to work? 30
Day		Earned Pennies
---		--------------
1		2
2		4
3		8
4		16
5		32
6		64
7		128
8		256
9		512
10		1,024
11		2,048
12		4,096
13		8,192
14		16,384
15		32,768
16		65,536
17		131,072
18		262,144
19		524,288
20		1,048,576
21		2,097,152
22		4,194,304
23		8,388,608
24		16,777,216
25		33,554,432
26		67,108,864
27		134,217,728
28		268,435,456
29		536,870,912
30		1,073,741,824
Total pay: $10,737,418.24
Process finished with exit code 0
 */
