package SallysLemonadeStand;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<UserAccount> listOfAccounts = new ArrayList<UserAccount>(); // have access to it everywhere in your
                                                                                 // class. it's the class's variable
    static Scanner scr = new Scanner(System.in);

    static Product strawLemon = new Product(
            "Strawberry Sweetness",
            "Strawberry Lemonade",
            8.99,
            20000);
    static Product blueLemon = new Product(
            "Bluey Sourness, Tastes Like Blue",
            "Blueberry Lemonade",
            6.99,
            20000);
    static Product wtrLemon = new Product(
            "Spicy Hot Watermelon Goodness",
            "Watermelon Lemonade",
            10.99,
            20000);
    static Product water = new Product(
            "This Stuff Doesn't Grow On Trees",
            "Boneless 'Special' Water",
            14.99,
            20000);

    public static void main(String[] args) {

        int choice;
        do {

            UserAccount account = null;
            System.out.println("Welcome to Sally's Lemonade Stand!");
            System.out.println("What would you like to do? ");
            System.out.println("1) Create an account.");
            System.out.println("2) Log In");
            System.out.println("3) Buy some lemonade");

            choice = scr.nextInt();

            switch (choice) {
                case 1:
                    createAnAccount();
                    break;
                case 2:
                    account = logIn();
                    break;
                case 3:
                    buyProduct(account);
                    account = null;
                    break;
                case 1337:
                    System.out.println("RIP Sally's Lemonade Stand For The Day.");
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        } while (choice != 1337);
    }

    public static void createAnAccount() {

        System.out.println("Sign up for an account!");

        System.out.print("What is your name? ");
        String name = scr.nextLine();

        System.out.print("What is your email? ");
        String email = scr.nextLine();

        System.out.print("What is your password? ");
        String password = scr.nextLine();

        System.out.print("What is your phone number? ");
        String phoneNumber = scr.nextLine();

        UserAccount account = new UserAccount(); // could also do new UserAccount(name, email, password, phoneNumber)
                                                 // and rmv next 4 lines
        account.setName(name);
        account.setEmail(email);
        account.setPassword(password);
        account.setPhoneNumber(phoneNumber);

        listOfAccounts.add(account);
    }

    public static UserAccount logIn() {

        System.out.print("What is your email? ");
        String email = scr.nextLine();
        System.out.print("What is your password? ");
        String password = scr.nextLine();

        for (UserAccount account : listOfAccounts) {
            if (email.equals(account.getEmail())
                    && password.equals(account.getPassword())) {
                return account;
            }
        }
        System.out.println("Invalid email/password.");
        return null;
    }

    public static void buyProduct(UserAccount account) {

        String keepBuying = "";
        String keepBuyingCapitalized = "";
        ArrayList<Product> cart = new ArrayList<Product>();

        do {

            System.out.println("What kind of lemonade you want?");
            System.out.println("1) Strawberry Lemonade");
            System.out.println("2) Blueberry Lemonade");
            System.out.println("3) Watermelon Lemonade");
            System.out.println("4) Boneless 'Special' Water");

            // choose which you want
            // choose how many you want
            // hit buy

            int choice = scr.nextInt();
            System.out.println("How many? ");
            int amount = scr.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(strawLemon);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(blueLemon);
                    }
                    break;
                case 3:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(wtrLemon);
                    }
                    break;
                case 4:
                    for (int i = 1; i <= amount; i++) {
                        cart.add(water);
                    }
                    break;
                default:

            }

            System.out.print("Would you like to buy more (Y/N)? ");
            String something = scr.nextLine();
            keepBuying = scr.nextLine();
            keepBuyingCapitalized = keepBuying.toUpperCase();

        } while (keepBuyingCapitalized.equals("Y"));

        Double cost = 0.0;

        for (int i = 0; i < cart.size(); i++) {
            Product productAtIndex = cart.get(i);
            if (account != null) {account.getPurchaseHistory().add(productAtIndex);}
            cost += productAtIndex.getPrice(); 

            productAtIndex.removeOneProduct();
        }

        System.out.print("Are you using a credit card to pay?(Y/N) ");
        String creditYesOrNo = scr.nextLine();
        String creditCaps = creditYesOrNo.toUpperCase();
        boolean loopAgain = false;
        if (creditCaps.equals("Y")) {
            do {

                CreditCard creditCard = createCard(account, cost);

                if (cost > creditCard.getBalance()) {
                    System.out.println("Card declined.");
                    loopAgain = true;
                }    
            } while (loopAgain == true);
        }

        System.out.println("Your total cost will be: " + cost);

        System.out.println("Thank you for your patronage");
    }


    public static CreditCard createCard(UserAccount account, Double cost) {

        System.out.print("What is your card number? ");
        String cardNumber = scr.nextLine();

        System.out.print("What is the name on your card? ");
        String nameOnCard = scr.nextLine();

        System.out.print("When does your card expire? ");
        String expDate = scr.nextLine(); // 2027-04-05
        LocalDate localDate = LocalDate.parse(expDate);

        System.out.print("What is your ccv number? ");
        Integer ccv = scr.nextInt();

        System.out.print("What is your zip code? ");
        Integer zipCode = scr.nextInt();

        System.out.print("What is your balance? ");
        Double balance = scr.nextDouble();

        CreditCard creditCard = new CreditCard(nameOnCard, cardNumber, localDate, ccv, zipCode, balance);
        
        System.out.println("Would you like to add this card to your account? (Y/N)");
        String addOrNot = scr.nextLine();
        String addOrNotCaps = addOrNot.toUpperCase();
        if (addOrNotCaps.equals("Y") && account != null) {
            account.setcreditCard(creditCard);
        } else if (account == null) {
            System.out.println("Log in to connect card to account.");
        }

        return creditCard;
    }
}
