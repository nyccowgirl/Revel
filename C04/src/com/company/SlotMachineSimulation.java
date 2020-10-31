package com.company;

/*
SLOT MACHINE SIMULATION
C04/PC22

A slot machine is a gambling device that the user inserts money into and then pulls a lever (or presses a button). The
slot machine then displays a set of random images. If two or more of the images match, the user wins an amount of money
that the slot machine dispenses back to the user.

Create a program that simulates a slot machine. When the program runs, it should do the following:
    - Asks the user to enter the amount of money he or she wants to enter into the slot machine.
    - Instead of displaying images, the program will randomly select a word from the following list:
            Cherries, Oranges, Plums, Bells, Melons, Bars
    - To select a word, the program can generate a random number in the range of 0 through 5. If the number is 0, the
      selected word is Cherries; if the number is 1, the selected word is Oranges; and so forth. The program should
      randomly select a word from this list three times and display all three of the words.
    - If none of the randomly selected words match, the program will inform the user that he or she has won $0. If two
      of the words match, the program will inform the user that he or she has won two times the amount entered. If three
      of the words match, the program will inform the user that he or she has won three times the amount entered.
    - The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program
      displays the total amount of money entered into the slot machine and the total amount won. Decision Structures
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SlotMachineSimulation {

    public static void main(String[] args) {
        String[] slotImages = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
        int[] countImages = new int[6];
        int num, max;
        double wager, winnings, totalWager = 0, totalWon = 0;
        char playAgain;
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        do {
            Arrays.fill(countImages, 0);
            max = 0;

            System.out.print("Enter your wager: ");
            wager = input.nextDouble();
            totalWager += wager;

            for (int i = 0; i < 3; i++) {
                num = random.nextInt(6);
                System.out.print(slotImages[num] + "\t");
                countImages[num]++;
            }

            for (int i = 0; i < 6; i++) {
                if (countImages[i] > 1) {
                    max = countImages[i];
                }
            }

            if (max == 3) {
                winnings = wager * 3;
            } else if (max == 2) {
                winnings = wager * 2;
            } else {
                winnings = 0;
            }

            totalWon += winnings;
            System.out.printf("\nYou've won $%,.2f.\n", winnings);
            input.nextLine();

            do {
                System.out.print("Do you want to play again? (y/n) ");
                playAgain = input.nextLine().charAt(0);

                if (!(playAgain == 'y' || playAgain == 'n')) {
                    System.out.println("Invalid input: enter 'y' or 'n'.");
                }
            } while (!(playAgain == 'y' || playAgain == 'n'));

        } while (playAgain == 'y');

        System.out.printf("Total wagered: $%,.2f\n", totalWager);
        System.out.printf("Total won: $%,.2f\n", totalWon);
    }
}


/*
Enter your wager: 2
Bells	Bells	Bells
You've won $6.00.
Do you want to play again? (y/n) y
Enter your wager: 1.5
Oranges	Bars	Bars
You've won $3.00.
Do you want to play again? (y/n) y
Enter your wager: 4
Oranges	Oranges	Melons
You've won $8.00.
Do you want to play again? (y/n) y
Enter your wager: 2.75
Bars	Oranges	Plums
You've won $0.00.
Do you want to play again? (y/n) n
Total wagered: $10.25
Total won: $17.00

Process finished with exit code 0
 */
