package quizThree;

import java.util.Scanner;

public class QuizThree {
    public static void main(String[] args) {

        QuizThree.theDays();

        QuizThree.greatestNumber();

        System.out.print(QuizThree.largest(98, 78,87));
    }



    /*
     * Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
     * Test Data Input number: 5 *
     */
    public static void theDays() {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your number? ");
        int num = input.nextInt();
        String dayName = null;
        switch(num) {
            case 1:
                dayName= "Monday";
                break;
            case 2:
                dayName= "Tuesday";
                break;
            case 3:
                dayName= "Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Friday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;

        }
        System.out.println("Day name is: "+ dayName);
    }


    /*
     * Given Three Numbers are 35,78,87 . Find out Greatest Number.
     */

    public static void greatestNumber() {
        int num1 = 35; int num2= 78; int num3= 87;

        if( num1 >= num2 && num1 >= 3) {
            System.out.println(num1 + " is the greatest number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the greatest number");
        } 	else {
            System.out.println(num3 + " is the greatest number");
        }
    }

    // second way to do it
    public static double largest(double x, double y, double z) {
        return Math.max(Math.max(x, y),z);
    }
}
