package Lab1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        
        // Declare variables
        Scanner input = new Scanner(System.in);
        String userInput;
        char firstLetter;

        // Get information from the user
        System.out.print("Give me a letter and I'll convert it to an ascii value. ");
        userInput = input.nextLine();

        input.close();

        // Find out the first letter in case
        // the user typed in more than one letter
        firstLetter = userInput.charAt(0);

        // Print result
        System.out.println("The ascii value of the letter " + firstLetter + " is " + letterToAscii(firstLetter));
    }

    public static int letterToAscii(char letter) {
        
        // Declare asciiValue and assign it as an int,
        // converting the character to the ascii number it equates to
        int asciiValue = (int) letter;

        return asciiValue;
    }
}
