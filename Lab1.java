// Everything is run using methods. main() pretty much does nothing but call them
// Uncomment the methods in main to see what they can do
// Or you can uncomment them all like a mad-lad. But that'll probably be hard to keep track of

package Labs;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        // max3();
        // min3();
        // middle3();
        // xor();
        // System.out.println(isFactor(3, 6));
        // System.out.println(isPerfect());
        System.out.println(isPrime());
        
    }


    public static void max3() {

        Scanner input = new Scanner (System.in);
        int highestNum;

        System.out.print("Enter an integer: ");
        if (input.hasNextInt()) {
            highestNum = input.nextInt();

            for(int i = 0; i < 2; i++) {

                System.out.print("Enter an integer: ");
                if (input.hasNextInt()) {
                    int inputNumber = input.nextInt();
                    if (inputNumber > highestNum) { // it's difficult to write this if-statement without
                        highestNum = inputNumber;   // the initial if-statement on line 29,
                    }                               // because highestNum doesn't have a value until you input it,
                } else {                            // otherwise it's zero.
                    break;                          // the user can also enter just negative integers
                }                                   // the answer would be 0, which would be wrong
            }

            System.out.println("The highest number of the three integers is " + highestNum);
        } else {
            System.out.println("Invalid input. Restart the program.");
        }
        input.close();

    }


    public static void min3() {

        Scanner input = new Scanner(System.in);
        int lowestNum;

        System.out.print("Enter an integer: ");
        if (input.hasNextInt()) {
            lowestNum = input.nextInt();

            for (int i = 0; i < 2; i++) {

                System.out.print("Enter an integer: ");
                if (input.hasNextInt()) {
                    int inputNumber = input.nextInt();
                    if (inputNumber < lowestNum) {
                        lowestNum = inputNumber;
                    }
                } else {
                    break;
                }

            }
            System.out.println("The smallest of the three integers is " + lowestNum);

        } else {
            System.out.println("Invalid input. Restart the program.");
        }
        input.close();

    }


    public static void middle3() {

        Scanner input = new Scanner(System.in);
        int initialInput, lowestNum, highestNum, middleNum, runningTotal = 0;

        System.out.print("Enter an integer: ");
        if (input.hasNextInt()) { // the first number you input gets its own if-statement
            initialInput = input.nextInt();
            lowestNum = initialInput; // the initial number is technically the lowest and highest number
            highestNum = initialInput;
            runningTotal += initialInput;

            for (int i = 0; i < 2; i++) {                  // this loops only twice because I couldn't 
                System.out.print("Enter an integer: "); // compare the lowest/highest numbers otherwise
                if (input.hasNextInt()) {                  // without having that inital if-statement on line 92
                    int inputNumber = input.nextInt();
                    runningTotal += inputNumber;
                    if (inputNumber < lowestNum) {
                        lowestNum = inputNumber;
                    }
                    if (inputNumber > highestNum) {
                        highestNum = inputNumber;
                    }
                } else {
                    break;
                }

            }
            middleNum = runningTotal - lowestNum - highestNum;
            System.out.println("The middlest of the three integers is " + middleNum);

        } else {
            System.out.println("Invalid input. Restart the program.");
        }
        input.close();

    }


    public static void xor() {

        Scanner input = new Scanner(System.in);
        boolean result;

        System.out.print("Enter true or false. ");

        // Did not use for loop because I couldn't figure out how to compare to first two inputs that way
        // Used nesting if-statements instead
        if (input.hasNextBoolean()) {
            boolean firstBool = input.nextBoolean(); // get first true/false input
            System.out.print("Enter true or false again. ");
            if (input.hasNextBoolean()) {
                boolean secondBool = input.nextBoolean(); // get second true/false input
                if (firstBool == true || secondBool == true) { // if one is true
                    if (firstBool == true && secondBool == true) { // if both are true
                        result = false;
                        System.out.println("The result is " + result);
                    } else { // if one is true but not both
                        result = true;
                        System.out.println("The result is " + result);
                    }
                } else { // if both are false
                    result = false;
                    System.out.println("The result is " + result);
                }
            } else {
                System.out.println("Invalid response. Restart the program.");
            }
        } else {
            System.out.println("Invalid response. Restart the program.");
        } // Both invalid responses happen when a boolean value is not entered by the user
                
        input.close();

    }


    public static boolean isFactor(int factor, int product) {

        // If the first number is a factor to the second number, print out true. Otherwise false. Ezpz
            if (product % factor == 0) {
                return true;
            } else {
                return false;
            }

    }


    public static boolean isPerfect() {

        Scanner input = new Scanner(System.in); 
        boolean isPerfectOrNot;      
        System.out.print("Enter a number to see if it is a perfect number. ");
        if (input.hasNextInt()) {
            int number = input.nextInt(), sum = 0;        

            for (int i = 1; i < number; i++) { // loop through every number starting at 1 up to the entered integer
                if (isFactor(i, number) == true) {
                    sum += i; // add number to the sum if is indeed a factor of the entered integer
                }
            }
            if (sum == number) {
                isPerfectOrNot = true;
            } else {
                isPerfectOrNot = false;
            }
        } else {
            System.out.println("Invalid input. Restart the program");
            isPerfectOrNot = false;
        }
        input.close();
        return isPerfectOrNot;        

    }


    public static boolean isPrime() {

        // Almost identical to the previous method
        Scanner input = new Scanner(System.in);
        boolean isPrimeOrNot = true;
        System.out.print("Enter a number to see if it is a prime number. ");
        if (input.hasNextInt()) {
            int number = input.nextInt();
            if (number == 1) {
                System.out.println("1 is technically neither. You smart squirrel, you.");
            } else {       
                for (int i = 2; i < number; i++) { // i starts at 2 because ALL numbers have 1 as a factor
                    if (isFactor(i, number) == true) {
                        isPrimeOrNot = false; // that's all that's needed to know if it's prime. just that one number other than 1
                    }
                } // no else statement because isPrimeOrNot is normally true. only false when the number is composite
        }
    } else {
        System.out.println("Invalid input. Restart the program.");
    }
        input.close();
        return isPrimeOrNot;

    }
}
