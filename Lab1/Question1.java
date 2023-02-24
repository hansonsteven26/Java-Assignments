package Lab1;

import java.util.Scanner;

public class Question1 {  
    public static void main(String[] args) {

        String string = findCircumference();
        // Call the function as a string variable
        

        // If I didn't do this, I'd have to put sysout in the function
        // I wouldn't be able to just call the function and that's it
        System.out.println(string);

    }

    public static String findCircumference() {

        // Declare variables. PI is always the same, so it's capitalized
        double radius, circumference, area, PI = 3.14;
        Scanner input = new Scanner(System.in);

        // Getting information from the user, which is just the radius
        System.out.print("What is the radius of the circle? ");
        radius = input.nextFloat();

        // Perform calculations
        area = (radius * radius) * PI;
        circumference = 2 * PI * radius;

        input.close();

        // Print out the circumference    
        return "The area is " + area + ", and the circumference is " + circumference + ".";
        
    }

}