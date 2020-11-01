package com.company;

/*
SHOWCAR METHOD
C05/PC01

Write a method named showChar. The method should accept two arguments: a reference to a String object and an integer.
The integer argument is a character position within the String, with the first character being at position 0. When
the method executes, it should display the character at that character position. Demonstrate the method in a complete
program.
 */

import java.util.Scanner;

public class showCharMethod {

    public static void main(String[] args) {
        String string;
        int index;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a line of text: ");
        string = input.nextLine();
        System.out.print("Enter your index: ");
        index = input.nextInt();
        showChar(string, index);
    }

    public static void showChar(String str, int i) {
        System.out.println(str.charAt(i));
    }
}
