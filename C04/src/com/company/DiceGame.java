package com.company;

/*
DICE GAME
C04/PC21

Write a program that plays a simple dice game between the computer and the user. When the program runs, a loop
should repeat 10 times. Each iteration of the loop should do the following:
    - Generate a random integer in the range of 1 through 6. This is the value of the computer’s die.
    - Generate another random integer in the range of 1 through 6. This is the value of the user’s die.
    - The die with the highest value wins. (In case of a tie, there is no winner for that particular roll of the dice.)

As the loop iterates, the program should keep count of the number of times the computer wins, and the number of times
that the user wins. After the loop performs all of its iterations, the program should display who was the grand winner,
the computer or the user.
 */

import java.util.Random;

public class DiceGame {

    public static void main(String[] args) {
        int times = 10, computer, user, countComp = 0, countUser = 0;
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            computer = random.nextInt(6) + 1;
            System.out.println("The computer has: " + computer);
            user = random.nextInt(6) + 1;
            System.out.println("You have: " + user);

            if (computer > user) {
                System.out.println("The computer wins!");
                countComp++;
            } else if (computer < user) {
                System.out.println("You win!");
                countUser++;
            } else {
                System.out.println("It's a tie!");
            }
        }

        if (countComp > countUser) {
            System.out.print("The computer is the grand winner winning " + countComp);
            System.out.println(" of the " + times + " games!!");
        } else if (countComp < countUser) {
            System.out.print("You are the grand winner winning " + countUser);
            System.out.println(" of the " + times + " games!!");
        } else {
            System.out.print("You and the computer are tied!");
        }
    }
}
