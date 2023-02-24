package Lab1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        
        // Declare variables
        float base, height;
        Scanner input = new Scanner(System.in);


        // Getting the base and height from the user
        System.out.print("What is the base of the triangle? ");
        base = input.nextFloat();

        System.out.print("What is the height of the triangle? ");
        height = input.nextFloat();

        input.close();

        // Display the result
        System.out.println("The area of the triangle is " + findArea(base, height));

    }

    public static double findArea(double b, double h) {

        // Declare variable
        double area;

        // Calculate and return area
        area = (b * h) / 2;
        return area;

    }
}
