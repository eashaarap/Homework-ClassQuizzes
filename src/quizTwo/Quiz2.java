package quizTwo;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        // 1st question: write java program to print sum of two numbers.
        //Test Data 84 + 35. Expected output: 119

        int x = 84;
        int y = 35;
        int sum = x + y;
        System.out.println(sum);


        // 2nd question: write java program to divide two numbers and print on screen.
        //Test Data 50 / 3. Expected output: 16

        int a = 50;
        int b = 3;
        int result = a / b;
        System.out.println(result);

        // 3rd question: Write a Java program that takes two numbers as input and display the product of two numbers.
        //Test Data:Input first number: 25 Input second number: 5 Expected Output : 25 x 5 = 125

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your first number? ");
        int num1 = scan.nextInt();
        System.out.println("What is your second number? ");
        int num2 = scan.nextInt();
        System.out.println("The product of your numbers is: " + num1 * num2);

        scan.close();


    }
}