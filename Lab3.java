package Labs;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int userInput;
        String userInputRepeat = "", userInputRepeatCapitalized = "";
        do {
            System.out.println("Enter 1 for character removing\n" +
                    "Enter 2 for removing duplicates\n" +
                    "Enter 3 for counting vowels and consonants\n" +
                    "Enter 4 for displaying non-repeating and then repeated characters.");
            userInput = scr.nextInt();
            switch (userInput) {
                case 1:
                    System.out.print("Enter a string: ");
                    String enteredString = scr.next();
                    removeChar(enteredString);
                    System.out.println("Do you want to repeat(Y/N)? ");
                    userInputRepeat = scr.next();
                    userInputRepeatCapitalized = userInputRepeat.toUpperCase();
                    break;
                case 2:
                    System.out.print("Enter a string: ");
                    enteredString = scr.next();
                    removeDupes(enteredString);
                    System.out.println("Do you want to repeat(Y/N)? ");
                    userInputRepeat = scr.next();
                    userInputRepeatCapitalized = userInputRepeat.toUpperCase();
                    break;
                case 3:
                    System.out.print("Enter a string: ");
                    enteredString = scr.next();
                    numVowelsConsonants(enteredString);
                    System.out.println("Do you want to repeat(Y/N)? ");
                    userInputRepeat = scr.next();
                    userInputRepeatCapitalized = userInputRepeat.toUpperCase();
                    break;
                case 4:
                    System.out.print("Enter a string: ");
                    enteredString = scr.next();
                    nonRepeated(enteredString);
                    System.out.println("Do you want to repeat(Y/N)? ");
                    userInputRepeat = scr.next();
                    userInputRepeatCapitalized = userInputRepeat.toUpperCase();
                    break;
                default:
                    System.out.println("Enter a number 1-4.");
                    break;
            }
        } while (userInputRepeatCapitalized.equals("Y"));

        scr.close();

    }

    public static void removeChar(String inputString) {

        String inputStringCapitalized = inputString.toUpperCase();
        Scanner scr = new Scanner(System.in);
        System.out.println("Which letter character do you wish to remove from the string?");
        System.out.print("Only the first character you enter will be changed. ");
        String enteredChar = scr.next();
        String enteredCharToCaps = enteredChar.toUpperCase();
        char enteredCharToCharacter = enteredCharToCaps.charAt(0);
        String returnString = "";
        int numOfCuts = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (enteredCharToCharacter != inputStringCapitalized.charAt(i)) {
                returnString = returnString.concat(Character.toString(inputString.charAt(i)));
            } else {
                numOfCuts += 1;
            }
        }
        if (numOfCuts == 0) {
            System.out.println("There were no " + enteredCharToCharacter + "'s in " + inputString);
        }
        System.out.println(inputString + " with no " + enteredCharToCharacter + "'s is " + returnString);
        scr.close();

    }

    public static void removeDupes(String inputString) {

        String resultString = "";

        for (int i = 0; i < inputString.length(); i++) {
            char tempChar = inputString.charAt(i);
            if (resultString.indexOf(tempChar) < 0) { // returns -1 when the temp character isn't in the new string
                resultString += tempChar; // essentially, the repeat character is not allowed into the new string with
                                          // this if-statement
            } // once it finds a second letter e, it says "oh i already have the letter
              // *whatever* at index *whatever*, so result of if statement equals 1"
        }

        System.out.println(resultString);

    }

    public static void numVowelsConsonants(String inputString) {

        String inputStringCapitalized = inputString.toUpperCase();
        int numVowels = 0, numConsonants = 0;
        for (int i = 0; i < inputString.length(); i++) {
            switch (Character.toString(inputStringCapitalized.charAt(i))) {
                case "A":
                    numVowels++;
                    break;

                case "E":
                    numVowels++;
                    break;

                case "I":
                    numVowels++;
                    break;

                case "O":
                    numVowels++;
                    break;

                case "U":
                    numVowels++;
                    break;

                case "Y":
                    numVowels++;
                    break;

                default:
                    numConsonants++;
                    break;
            }
        }
        System.out.println("Number of vowels is " + numVowels + ".");
        System.out.println("Number of consonants is " + numConsonants + ".");

    }

    public static void nonRepeated(String inputString) {

        String inputStringCapitalized = inputString.toUpperCase();
        String returnString = "", repeatString = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (inputStringCapitalized.indexOf(inputStringCapitalized.charAt(i)) != inputStringCapitalized
                    .lastIndexOf(inputStringCapitalized.charAt(i))) {
                repeatString = repeatString.concat(Character.toString(inputString.charAt(i)));
            } else {
                returnString = returnString.concat(Character.toString(inputString.charAt(i)));
            }
        }

        System.out.println(returnString + repeatString);

    }
}
