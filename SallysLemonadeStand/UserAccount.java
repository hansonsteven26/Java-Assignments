package SallysLemonadeStand;

import java.util.ArrayList;

public class UserAccount {

    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private ArrayList<Product> purchaseHistory;
    private CreditCard creditCard;

    // Address saved for later

    public UserAccount() {
    }

    public UserAccount(String name, String email, String password, String phoneNumber) {
        this.name = name; // only things in constructor are only there upon immediately creating object
        this.email = email; // if don't immediately need it, don't needa be in here
        this.password = password;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Product> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void setPurchaseHistory(ArrayList<Product> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }

    public CreditCard getcreditCard() {
        return creditCard;
    }

    public void setcreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String toString() {
        return "UserAccount [name=" + name + ", email=" + email + ", password=" + password + ", phoneNumber="
                + phoneNumber + ", purchaseHistory=" + purchaseHistory + ", creditCard=" + creditCard + "]";
    }
}
