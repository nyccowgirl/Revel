package com.company;

/*
ESP GAME
C04/PC19

Write a program that tests your ESP (extrasensory perception). The program should randomly select the name of a color
from the following list of words:
            Red, Green, Blue, Orange, Yellow

To select a word, the program can generate a random number. For example, if the number is 0, the selected word is
Red, if the number is 1, the selected word is Green, and so forth.

Next, the program should ask the user to enter the color that the computer has selected. After the user has entered
his or her guess, the program should display the name of the randomly selected color. The program should repeat this
10 times and then display the number of times the user correctly guessed the selected color.
 */

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int computer, user, count = 0, times = 10;
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < times; i++) {
            computer = random.nextInt(5);
            System.out.println("Pick from one of the colors:");
            System.out.println("0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow");
            do {
                System.out.print("Enter your guess (0 - 4): ");
                user = input.nextInt();

                if (user < 0 || user > 4) {
                    System.out.println("Invalid input: guess has to be from 0 to 4.");
                }

            } while (user < 0 || user > 4);

            System.out.println("Computer's selection was: " + colors[computer]);

            if (user == computer) {
                count++;
            }
        }
        System.out.println("You've guessed correctly " + count + " out of " + times + " times.");
    }
}


/*
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 3
Computer's selection was: Orange
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 2
Computer's selection was: Blue
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 4
Computer's selection was: Green
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 1
Computer's selection was: Blue
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 2
Computer's selection was: Blue
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 0
Computer's selection was: Green
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 3
Computer's selection was: Blue
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 2
Computer's selection was: Green
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 1
Computer's selection was: Blue
Pick from one of the colors:
0 - Red; 1 - Green; 2 - Blue; 3 - Orange; 4 - Yellow
Enter your guess (0 - 4): 1
Computer's selection was: Orange
You've guessed correctly 3 out of 10 times.

Process finished with exit code 0
 */
