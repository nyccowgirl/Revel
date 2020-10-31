package com.company;

/*
FILE LETTER COUNTER
C04/PC06

Write a program that asks the user to enter the name of a file, and then asks the user to enter a character. The
program should count and display the number of times that the specified character appears in the file. Use Notepad
or another text editor to create a simple file that can be used to test the program.
 */

import java.util.Scanner;
import java.io.*;

public class LetterCounterFile {

    public static void main(String[] args) throws IOException {
        int count = 0;
        String file;
        char target, character;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        file = input.nextLine();
        File inputFile = new File(file);
        Scanner readFile = new Scanner(inputFile);
        System.out.print("Enter character to count: ");
        target = input.nextLine().charAt(0);

        while (readFile.hasNext()) {
            String str = readFile.next();

            for (int i = 0; i < str.length(); i++) {
                character = str.charAt(i);

                if (character == target) {
                    count++;
                }
            }

        }

        System.out.print("The character '" + target + "' appears in the file ");
        System.out.println(file + " " + count + " times.");
    }
}


/*
Enter file name: lettercounterfile.txt
Enter character to count: s
The character 's' appears in the file lettercounterfile.txt 7 times.

Process finished with exit code 0
 */
