package com.company;

/*
SHOWCHAR METHOD
C05/PC01

Write a method named showChar. The method should accept two arguments: a reference to a String object and an integer.
The integer argument is a character position within the String, with the first character being at position 0. When
the method executes, it should display the character at that character position. Demonstrate the method in a complete
program.
 */

import java.util.Scanner;

public class ShowCharMethod {

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


    /**
     * The showChar method prints out the character at a specified index of a string.
     * @param str String object
     * @param i index number
     */

    public static void showChar(String str, int i) {
        System.out.println(str.charAt(i));
    }
}


/*
Enter a line of text: New York
Enter your index: 2
w

Process finished with exit code 0
 */
