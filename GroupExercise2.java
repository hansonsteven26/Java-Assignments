import java.util.Scanner;

public class GroupExercise2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice;
        double usdAmount;
        
        System.out.print("Enter a USD amount to see how much it is worth" +
        "in Canada(Enter 1), the European Union(Enter 2), or the United Kingdon(Enter 3). ");

        choice = input.nextInt();

        switch(choice) {
            case 1:
            System.out.print("Enter a USD amount to convert it to CAD. ");
            if (input.hasNextDouble()) {
                usdAmount = input.nextDouble();
                System.out.println(usdToCad(usdAmount));
            } else {
                System.out.println("Invalid input. Please enter USD dollar amount.");
            }
            break;
            case 2:
            System.out.print("Enter a USD amount to convert it to EURO. ");
            if (input.hasNextDouble()) {
                usdAmount = input.nextDouble();
                System.out.println(usdToEuro(usdAmount));
            } else {
                System.out.println("Invalid input. Please enter USD dollar amount.");
            }
            break;
            case 3:
            System.out.print("Enter a USD amount to convert it to GBP. ");
            if (input.hasNextDouble()) {
                usdAmount = input.nextDouble();
                System.out.println(usdToGbp(usdAmount));
            } else {
                System.out.println("Invalid input. Please enter USD dollar amount.");
            }
            break;
            default:
            System.out.println("Invalid choice. Please choose 1 for Canada, " +
            "2 for European Union, or 3 for Great Britain.");
        }
        input.close();
    }

    public static double usdToCad(double originalAmount) {

        // Declare variables       
        double cadAmount = 0;

        // Perform calculations if the dollar amount is above 0
        if (originalAmount <= 0) {
            System.out.print("Canada: $");
        } else if (originalAmount > 0) {
            cadAmount = originalAmount * 1.35;
            cadAmount = Math.round(cadAmount * 100.0) / 100.0;
            System.out.print("Canada: $");
        }
          

        return cadAmount;

    }

    public static double usdToEuro(double originalAmount) {

        // Declare variables       
        double euroAmount = 0;

        // Perform calculations if the dollar amount is above 0
        if (originalAmount <= 0) {
            System.out.print("European Union: $");
        } else if (originalAmount > 0) {
            euroAmount = originalAmount * 0.94;
            euroAmount = Math.round(euroAmount * 100.0) / 100.0;
            System.out.print("European Union: $");
        } 

        return euroAmount;

    }

    public static double usdToGbp(double originalAmount) {

        // Declare variables       
        double gbpAmount = 0;

        // Perform calculations if the dollar amount is above 0
        if (originalAmount <= 0) {
            System.out.print("United Kingdom: $");
        } else if (originalAmount > 0) {
            gbpAmount = originalAmount * 0.83;
            gbpAmount = Math.round(gbpAmount * 100.0) / 100.0;
            System.out.print("United Kingdom: $");
        }

        return gbpAmount;

    }
}
