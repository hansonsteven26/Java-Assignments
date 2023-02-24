package Lab1;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        
        // Declare variables
        int year;
        Scanner input = new Scanner(System.in);

        // Get the year from the user
        System.out.print("What is the year? ");
        year = input.nextInt();

        input.close();

        // Call the function
        determineLeapYear(year);

    }

    public static void determineLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) { // if it's divisible by 4 as well
                if (year % 400 == 0) { // if it's divisible by 4 and 100 as well
                    System.out.println(year + " is a leap year."); // if it's divisible by all three
                } else { // if it's divisible by 4 and 100, but not 400
                    System.out.println(year + " is NOT a leap year.");               
                }            
            } else { // if it's divisible by 4 but not 100
                System.out.println(year + " is a leap year.");
            }        
        } else { // if it's not divisible by 4
            System.out.println(year + " is NOT a leap year.");
        }

    }
}
