package Lab1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        
        // Declare variables
        Scanner input = new Scanner(System.in);
        int userInput;

        // Get the number from the user
        System.out.print("What is the number? ");
        userInput = input.nextInt();

        input.close();

        // Print the result
        System.out.println("You entered " + userInput + ", the new value is " + toDouble(userInput));

    }

    public static double toDouble(int number) {

        // Declare newNum as a double
        double newNum;

        // Convert from int to double and return double
        newNum = (double) number;
        return newNum;

    }
}
