package Lab1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        // Declare variables
        Scanner input = new Scanner(System.in);
        int inputNumber;

        // Get the number from the user
        System.out.print("What is the number? ");
        inputNumber = input.nextInt();

        input.close();

        // Run the function
        evenOrOdd(inputNumber);

    }

    public static void evenOrOdd(int number) {

        // Use If Statement and Modulus to see if it is even or odd
        if (number % 2 == 0) { // if the remainder of the number divided by 2 is zero
            System.out.println("The number is even.");
        } else if (number % 2 == 1) { // if the remainder is one
            System.out.println("The number is odd.");
        } else { // if the remainder is anything else
            System.out.println("I don't even know what the number is.");
        }

    }
}
