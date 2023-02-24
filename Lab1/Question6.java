package Lab1;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        
        // Declare variables
        double userInput;
        Scanner input = new Scanner(System.in);

        // Ask the user for information
        System.out.print("What is your number as a decimal? ");
        userInput = input.nextDouble();

        input.close();

        // Print the result
        System.out.println("You entered " + userInput
            + ", the new value is " + roundedNum(userInput));

    }

    public static int roundedNum(double number) {

        // Declare variable and round it
        int newNum = (int) Math.round(number);

        return newNum;

    }
}
