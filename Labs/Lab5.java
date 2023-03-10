// un-comment line-by-line in main() to see what the functions do

package LabsNotOne;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {

        // System.out.println(numTimes());
        System.out.println(removeWhiteSpace());
        // System.out.println(findDupes());
        // System.out.println(reversePhrase());
    }

    public static int numTimes() {

        int occurrences = 0;
        Scanner scr = new Scanner(System.in);

        String userInput = scr.nextLine();
        String userInputLower = userInput.toLowerCase();
        char[] charArray = userInputLower.toCharArray();

        scr.close();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == 'a') {

                occurrences++;
            }
        }
        return occurrences;
    }

    public static char[] removeWhiteSpace() {

        Scanner scr = new Scanner(System.in);
        String userInput = scr.nextLine();
        char[] charArray = userInput.toCharArray();
        char[] newCharArray = new char[' '];

        scr.close();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] != ' ') {

                newCharArray[i] += charArray[i];
            }
        }

        return newCharArray;
    }

    public static char[] findDupes() {

        Scanner scr = new Scanner(System.in);
        String userInput = scr.nextLine();
        char[] charArray = userInput.toCharArray();
        char[] listOfDupes = new char[charArray.length];
        int numOfDupes = 0;

        scr.close();

        for (int i = 0; i < charArray.length; i++) {

            for (int j = i + 1; j < charArray.length; j++) {

                if (charArray[i] == charArray[j]) {

                    listOfDupes[numOfDupes] += charArray[i];
                    numOfDupes += 1;
                }
            }
        }

        System.out.println("There were " + numOfDupes + " duplicate characters.");
        System.out.print("Here are the duplicate characters (one might be a space): ");
        return listOfDupes;
    }

    public static char[] reversePhrase() {

        int start = 0;
        Scanner scr = new Scanner(System.in);
        String userInput = scr.nextLine();
        userInput = userInput.concat(" ");
        char[] charArray = userInput.toCharArray();

        scr.close();

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == ' ') {

                reverseWord(charArray, start, i); // reverse word in charArray, from index of start to index of i
                start = i + 1; // beginning of new word, which is after the space
            }
        }

        reverseWord(charArray, 0, charArray.length - 1);

        return charArray;
    }

    public static void reverseWord(char[] word, int start, int end) {

        char tempChar;

        while (start <= end) {

            tempChar = word[start];
            word[start] = word[end]; // beginning becomes end
            word[end] = tempChar; // end becomes beginning
            start++; // ++ and -- to get second letter/second-to-last letter ... third
                     // letter/third-to-last letter ... etc.
            end--;
        }
    }
}
