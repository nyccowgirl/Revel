package com.company;

/*
PERSONAL WEB PAGE GENERATOR
C04/PC23
Write a program that asks the user for his or her name, and then asks the user to enter a sentence that describes him
or herself. Once the user has entered the requested input, the program should create an HTML file, containing the input,
for a simple Web page.
 */

import java.io.*;
import java.util.Scanner;

public class PersonalWebPageGenerator {

    public static void main(String[] args) throws IOException {
        String name, description;
        Scanner input = new Scanner(System.in);
        PrintWriter inputFile = new PrintWriter("personalwebpage.html");

        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Describe yourself: ");
        description = input.nextLine();

        // Create webpage html
        inputFile.println("<html>");
        inputFile.println("<head>");
        inputFile.println("</head>");
        inputFile.println("<body>");
        inputFile.println("\t<center>");
        inputFile.println("\t\t<h1>" + name + "</h1>");
        inputFile.println("\t</center>");
        inputFile.println("\t<hr />");
        inputFile.println("\t" + description);
        inputFile.println("\t<hr />");
        inputFile.println("</body>");
        inputFile.println("</html>");

        inputFile.close();
    }
}


/*
Enter your name: Julie Taylor
Describe yourself: I am a computer science major, a member of the Jazz club, and I hope to work as a mobile app
developer after I graduate.

Process finished with exit code 0
 */
