package quizFour;

import java.util.Scanner;

public class QuizFour {
    public static void main(String[] args) {
        QuizFour.increasingDecreasing();

        QuizFour.ageScan();

        /*
         * Write Java program to allow the user to input his/her age.
         *  Then the program will show if the person is eligible to vote.
         *  A person who is eligible to vote must be older than or equal to 18 years old.
         *  Enter your age: 18 .You are eligible to vote. *
         */
    }

    public static void increasingDecreasing() {
            Scanner input = new Scanner(System.in);
            int age;
            System.out.println("What is your age? ");
            age = input.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");

            }
        }


		/*
		 * Write a program that accepts three numbers from the user and prints
		 * "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order,
		 * and "Neither increasing or decreasing order" otherwise.
		 Test Data : Input first number: 1524 Input second number: 2345 Input third number: 3321 *
		 */

        public static void ageScan() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your first number: ");
            int num1 = scan.nextInt();
            System.out.println("Please enter your second number: ");
            int num2 = scan.nextInt();
            System.out.println("Please enter your third number: ");
            int num3 = scan.nextInt();

            if (num1 < num2 && num2 < num3) {
                System.out.println("Numbers are in INCREASING Order");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("Numbers are DECREASING Order");
            } else {
                System.out.println("Neither increasing or decreasing order");
            }
        }





}
