package PhoneBook;

import java.util.*;

public class People {

    private String firstName;
    private String lastName;
    private String middleName;
    private Address address;
    private Long phoneNumber;

    public People() {
    }

    public People(String firstName, String middleName, String lastName, Address address, Long phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static Comparator<People> nameComparator = new Comparator<People>() {         
        @Override         
        public int compare(People p1, People p2) {             
            return (int) (p1.getFirstName().compareTo(p2.getFirstName()));         
        }     
    };

    @Override
    public String toString() {
        return firstName + " " + middleName + lastName + ", " + address + ", " + phoneNumber;
    }
}
