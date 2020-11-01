package com.company;

/*
TEST AVERAGE AND GRADE
C05/PC07

Write a program that asks the user to enter five test scores. The program should display a letter grade for each score
and the average test score. Write the following methods in the program:
    calcAverage —   This method should accept five test scores as arguments and return the average of the scores.
    determineGrade —This method should accept a test score as an argument and return a letter grade for the score,
                    based on the following grading scale:
                        Score       Letter Grade
                        90–100      A
                        80–89       B
                        70–79       C
                        60–69       D
                        Below 60    F
 */

import java.util.Scanner;

public class TestAverageAndGrade {
    public static void main(String[] args) {
        int numOfStudents = 5;
        int[] scores = new int[numOfStudents];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter test grade for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        System.out.println("The letter grades are as follows:");

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            System.out.println(determineGrade(scores[i]));
        }

        System.out.printf("The average grade was: %.2f\n", calcAverage(scores, numOfStudents));

    }


    /**
     * The determineGrade method returns the character for the equivalent grade based on the score.
     * @param score Score provided by user
     * @return Character for the letter grade
     */

    public static char determineGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }


    /**
     * The calcAverage method returns the average of five grades.
     * @param array Array storing 5 scores
     * @param size Size of the array
     * @return Average score of the 5 scores provided
     */

    public static double calcAverage(int[] array, int size) {
        int total = 0;

        for (int i = 0; i < size; i++) {
            total += array[i];
        }

        return (double)total / size;
    }
}


/*
Enter test grade for student 1: 55
Enter test grade for student 2: 65
Enter test grade for student 3: 75
Enter test grade for student 4: 85
Enter test grade for student 5: 95
The letter grades are as follows:
Student 1: F
Student 2: D
Student 3: C
Student 4: B
Student 5: A
The average grade was: 75.00

Process finished with exit code 0
 */