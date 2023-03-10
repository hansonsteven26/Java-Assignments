package PhoneBook;

import java.util.*;

public class Main {

    static ArrayList<People> listOfPeople = new ArrayList<People>();
    static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) {

        Address fakeAddress = new Address(5508, "Hennsley Cir", "Weldon Spring", "Missouri", 63304);
        People fakePerson = new People("Steven", "Michael ", "Hanson", fakeAddress, 6364975784L);
        listOfPeople.add(fakePerson);

        int choice;
        String keepGoing;
        String keepGoingCaps;

        do {

            System.out.println("This is the phonebook.");
            System.out.println("What would you like to do?");
            System.out.println("1) Add an entry.");
            System.out.println("2) Search for an entry");
            System.out.println("3) Remove an entry.");
            System.out.println("4) Update an entry.");
            System.out.println("5) Sort entries in ascending order.");
            System.out.println("6) Exit (This WILL close the program).");

            choice = scr.nextInt();

            switch (choice) {
                case 1:
                    addEntry();
                    break;

                case 2:
                    searchEntry();
                    break;

                case 3:
                    removeEntry();
                    break;

                case 4:
                    updateEntry();
                    break;

                case 5:
                    sortEntry();
                    break;

                default:
                    break;
            }

            System.out.print("Would you like to exit (Enter y or n)? ");
            keepGoing = scr.nextLine();
            keepGoingCaps = keepGoing.toUpperCase();
        } while (keepGoingCaps.equals("N"));

    }

    public static void addEntry() {

        System.out.println("Enter variables separated by commas: ");

        String something = scr.nextLine(); // need this or else userInput is just a space
        String userInput = scr.nextLine();
        String[] conversion = userInput.split(", ");
        String[] fullName = conversion[0].split(" ");
        String[] homeNumAndStreet = conversion[1].split(" ");

        People person = new People();
        Address address = new Address();

        // set all address values
        address.setHomeNum(getHomeNum(homeNumAndStreet));
        address.setStreet(getStreetName(homeNumAndStreet));
        address.setCity(conversion[2]);
        address.setState(conversion[3]);
        address.setZipCode(Integer.valueOf(conversion[4]));

        // set all person values
        person.setFirstName(fullName[0]);
        if (hasMiddle(fullName)) {
            person.setMiddleName(getMiddleName(fullName));
        } else {
            person.setMiddleName("");
        }
        person.setLastName(fullName[fullName.length - 1]);
        person.setPhoneNumber(Long.valueOf(conversion[5]));
        person.setAddress(address);

        listOfPeople.add(person);
    }

    public static boolean hasMiddle(String[] fullName) {

        boolean hasMiddle = false;
        if (fullName.length > 2) {
            hasMiddle = true;
        }
        return hasMiddle;
    }

    public static String getMiddleName(String[] fullName) {

        String middleName = "";
        for (int i = 1; i < (fullName.length - 1); i++) {
            middleName = middleName.concat(fullName[i] + " ");
        }
        return middleName;
    }

    public static Integer getHomeNum(String[] houseAndStreetNum) {

        Integer homeNum = Integer.valueOf(houseAndStreetNum[0]);
        return homeNum;
    }

    public static String getStreetName(String[] houseAndStreetNum) {

        String streetName = houseAndStreetNum[1] + " " + houseAndStreetNum[2];
        return streetName;
    }

    public static void searchEntry() {

        System.out.println("What would you like to search by?");
        System.out.println("1) By First Name.");
        System.out.println("2) By Last Name.");
        System.out.println("3) By Full Name.");
        System.out.println("4) By Telephone Number.");
        System.out.println("5) By City/State.");
        System.out.println("6) Stop Searching.");

        int choice = scr.nextInt();

        switch (choice) {
            case 1:
                searchByFirst();
                break;

            case 2:
                searchByLast();
                break;

            case 3:
                searchByFull();
                break;

            case 4:
                searchByPhone();
                String something = scr.nextLine();
                break;

            case 5:
                searchByLocation();
                break;

            default:
                something = scr.nextLine();
                break;
        }
    }

    public static void searchByFirst() {

        ArrayList<People> listOfFirstNames = new ArrayList<People>();
        System.out.print("Enter the first name you wish to search by: ");
        String something = scr.nextLine();
        String userInput = scr.nextLine();
        int count = 0;
        for (int i = 0; i < listOfPeople.size(); i++) {
            String firstNameAtIndex = listOfPeople.get(i).getFirstName();
            if (firstNameAtIndex.equals(userInput)) {
                listOfFirstNames.add(listOfPeople.get(i));
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No entries contain that name.");
        } else {
            System.out.println("Here is a list of entries containing the first name \"" + userInput + "\":");
            for (int i = 0; i < count; i++) {
                System.out.println(listOfFirstNames.get(i).toString());
            }
        }
    }

    public static void searchByLast() {

        ArrayList<People> listOfLastNames = new ArrayList<People>();
        System.out.print("Enter the last name you wish to search by: ");
        String something = scr.nextLine();
        String userInput = scr.nextLine();
        int count = 0;
        for (int i = 0; i < listOfPeople.size(); i++) {
            String lastNameAtIndex = listOfPeople.get(i).getLastName();
            if (lastNameAtIndex.equals(userInput)) {
                listOfLastNames.add(listOfPeople.get(i));
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No entries contain that name.");
        } else {
            System.out.println("Here is a list of entries containing the last name \"" + userInput + "\":");
            for (int i = 0; i < count; i++) {
                System.out.println(listOfLastNames.get(i).toString());
            }
        }
    }

    public static void searchByFull() {

        ArrayList<People> listOfFullNames = new ArrayList<People>();
        System.out.print("Enter the full name you wish to search by: ");
        String something = scr.nextLine();
        String userInput = scr.nextLine();
        int count = 0;
        String[] splitInput = userInput.split(" ");

        for (int i = 0; i < listOfPeople.size(); i++) {
            String firstNameAtIndex = listOfPeople.get(i).getFirstName();
            String lastNameAtIndex = listOfPeople.get(i).getLastName();
            String middleNameAtIndex = listOfPeople.get(i).getMiddleName();
            if (splitInput.length > 2) {
                if (splitInput[0].equals(firstNameAtIndex)
                        && (splitInput[1] + " ").equals(middleNameAtIndex)
                        && splitInput[splitInput.length - 1].equals(lastNameAtIndex)) {
                    listOfFullNames.add(listOfPeople.get(i));
                    count++;
                }
            } else {
                if (splitInput[0].equals(firstNameAtIndex)
                        && splitInput[1].equals(lastNameAtIndex)) {
                    listOfFullNames.add(listOfPeople.get(i));
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("No entries contain that name.");
        } else {
            System.out.println("Here is a list of entries containing the full name \"" + userInput + "\":");
            for (int i = 0; i < count; i++) {
                System.out.println(listOfFullNames.get(i).toString());
            }
        }
    }

    public static void searchByPhone() {

        ArrayList<People> listOfPhoneNumbers = new ArrayList<People>();
        System.out.print("Enter the phone number you wish to search by: ");
        String something = scr.nextLine();
        Long userInput = scr.nextLong();
        int count = 0;

        for (int i = 0; i < listOfPeople.size(); i++) {
            Long numberAtIndex = listOfPeople.get(i).getPhoneNumber();
            if (userInput.equals(numberAtIndex)) {
                listOfPhoneNumbers.add(listOfPeople.get(i));
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No entries contain that phone number.");
        }
        else {
            System.out.println("Here is a list of entries containing the phone number \"" + userInput + "\":");
            for (int i = 0; i < count; i++) {
                System.out.println(listOfPhoneNumbers.get(i).toString());
            }
        }
    }

    public static void searchByLocation() {

        ArrayList<People> listOfLocations = new ArrayList<People>();
        System.out.print("Enter the city or state (NOT CITY *AND* STATE) you wish to search by: ");
        String something = scr.nextLine();
        String userInput = scr.nextLine();
        int count = 0;

        for (int i = 0; i < listOfPeople.size(); i++) {
            String cityAtIndex = listOfPeople.get(i).getAddress().getCity();
            String stateAtIndex = listOfPeople.get(i).getAddress().getState();
            if (userInput.equals(cityAtIndex) || userInput.equals(stateAtIndex)) {
                listOfLocations.add(listOfPeople.get(i));
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No entries contain that location.");
        } else {
            System.out.println("Here is a list of entries containing the city or state \"" + userInput + "\":");
            for (int i = 0; i < count; i++) {
                System.out.println(listOfLocations.get(i).toString());
            }
        }
    }

    public static void updateEntry() {

        System.out.print("Enter a phone number you wish to update from ");
        Long userInput = scr.nextLong(), newPhone;
        String newFirst, newMiddle, newLast, newStreetName, newCity, newState, something = scr.nextLine();
        Integer newStreetNum, newZip;
        Address address = new Address();
        for (int i = 0; i < listOfPeople.size(); i++) {
            Long phoneAtIndex = listOfPeople.get(i).getPhoneNumber();
            if (phoneAtIndex.equals(userInput)) {
                System.out.print("What is the new FIRST name? ");
                newFirst = scr.nextLine();
                listOfPeople.get(i).setFirstName(newFirst);
                System.out.print("What is the new MIDDLE name? ");
                newMiddle = scr.nextLine() + " ";
                listOfPeople.get(i).setMiddleName(newMiddle);
                System.out.print("What is the new LAST name? ");
                newLast = scr.nextLine();
                listOfPeople.get(i).setLastName(newLast);
                System.out.print("What is the new street number? ");
                newStreetNum = scr.nextInt();
                something = scr.nextLine();
                address.setHomeNum(newStreetNum);
                System.out.print("What is the new street name? ");
                newStreetName = scr.nextLine();
                address.setStreet(newStreetName);
                System.out.print("What is the new city name? ");
                newCity = scr.nextLine();
                address.setCity(newCity);
                System.out.print("What is the new state name? ");
                newState = scr.nextLine();
                address.setState(newState);
                System.out.print("What is the new zip code? ");
                newZip = scr.nextInt();
                address.setZipCode(newZip);
                listOfPeople.get(i).setAddress(address);
                System.out.print("What is the new phone number? ");
                newPhone = scr.nextLong();
                something = scr.nextLine();
                listOfPeople.get(i).setPhoneNumber(newPhone);
            }
        }
    }

    public static void removeEntry() {

        System.out.print("Enter a phone number to remove the entry associated with it. ");
        Long userInput = scr.nextLong();
        for (int i = 0; i < listOfPeople.size(); i++) {
            if (listOfPeople.get(i).getPhoneNumber().equals(userInput)) {
                listOfPeople.remove(i);
            }
        }
        String something = scr.nextLine();
    }

    public static void sortEntry() {

        PeopleSorter peopleSort = new PeopleSorter(listOfPeople);        
        ArrayList<People> sortedPeople = peopleSort.getSortedPeopleByName();
        System.out.println("Here are the entries sorted by first name:");        
        for (People person : sortedPeople) {             
            System.out.println(person);         
        }
        String something = scr.nextLine();
    }
}