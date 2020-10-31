package com.company;

/*
LETTER COUNTER
C04/PC05

Write a program that asks the user to enter a string, and then asks the user to enter a character. The program should
count and display the number of times that the specified character appears in the string.
 */

import java.util.Scanner;

public class LetterCounter {

    public static void main(String[] args) {
        int count = 0;
        String str;
        char target, character;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = input.nextLine();
        System.out.print("Enter character to count: ");
        target = input.nextLine().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);

            if (character == target) {
                count++;
            }
        }

        System.out.print("The character '" + target + "' appears in the string \"");
        System.out.println(str + "\" " + count + " times.");
    }
}


/*
Enter a string: She sells seashells at the sea shore.
Enter character to count: s
The character 's' appears in the string "She sells seashells at the sea shore." 7 times.

Process finished with exit code 0
 */
