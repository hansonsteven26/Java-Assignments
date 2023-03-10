package SallysLemonadeStand;

import java.time.LocalDate;

public class CreditCard {
    
    private String nameOnCard;
    private String cardNumber;
    private LocalDate expDate;
    private Integer ccv;
    private Integer zipCode;
    private Double balance;

    public CreditCard() {
    }
    
    public CreditCard(String nameOnCard, String cardNumber, LocalDate expDate, Integer ccv, Integer zipCode, Double balance) {
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.ccv = ccv;
        this.zipCode = zipCode;
        this.balance = balance;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }
    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public LocalDate getExpDate() {
        return expDate;
    }
    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
    public Integer getCcv() {
        return ccv;
    }
    public void setCcv(Integer ccv) {
        this.ccv = ccv;
    }
    public Integer getZipCode() {
        return zipCode;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard [nameOnCard=" + nameOnCard + ", cardNumber=" + cardNumber + ", expDate=" + expDate + ", ccv="
                + ccv + ", zipCode=" + zipCode + ", balance=" + balance + "]";
    }
}
