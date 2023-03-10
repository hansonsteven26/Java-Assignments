// un-comment line-by-line in main() to see what the functions do

package LabsNotOne;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {

        // System.out.println(sumAandB());
        // System.out.println(squirrelPlay());
        // System.out.println(greenTicket());
        // System.out.println(countXX());
        // System.out.println(stringTimes());
    }

    public static int sumAandB() {

        // find amount of characters in sum and a

        Scanner scr = new Scanner(System.in);
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int sum = num1 + num2, lengthSum, lengthA;

        lengthSum = String.valueOf(sum).length();
        lengthA = String.valueOf(num1).length();
        scr.close();

        // compare amount of characters and return a or sum based on comparisons
        if (lengthA < lengthSum) {
            return num1;
        } else {
            return sum;
        }
    }

    public static boolean squirrelPlay() {

        boolean doPlay;
        Scanner scr = new Scanner(System.in);

        int temp;
        boolean isSummer;

        temp = scr.nextInt();
        isSummer = scr.nextBoolean();

        scr.close();

        if (isSummer) {

            if (60 <= temp && temp <= 100) {

                doPlay = true;
            } else {

                doPlay = false;
            }
        } else {

            if (60 <= temp && temp <= 90) {

                doPlay = true;
            } else {

                doPlay = false;
            }
        }

        return doPlay;
    }

    public static int greenTicket() {

        Scanner scr = new Scanner(System.in);
        int result = 0;

        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        scr.close();

        if (a == b) {

            if (b == c) {

                result = 20;
            } else {

                result = 10;
            }
        } else if (a == c) {

            result = 10;
        } else if (b == c) {

            result = 10;
        } else {

            result = 0;
        }

        return result;
    }

    public static int countXX() {

        int count = 0;
        Scanner scr = new Scanner(System.in);
        String givenString = scr.nextLine();

        scr.close();

        char[] stringToChar = givenString.toCharArray();

        for (int i = 1; i < stringToChar.length; i++) {

            if ((stringToChar[i] == 'x') && (stringToChar[i - 1] == 'x')) {
                count++;
            }
        }
        return count;
    }

    public static String stringTimes() {

        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        int n = scr.nextInt();
        String returnString = "";

        scr.close();

        for (int i = 0; i < n; i++) {

            returnString = returnString.concat(str);
        }
        return returnString;
    }
}
