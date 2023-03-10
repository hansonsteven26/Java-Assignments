package AbstractLab;

public abstract class Person {
    
    public abstract double taxes(double amount);
    public abstract double calculateTelePhoneBill(double amount);
    public abstract String getFullName();
    public abstract void setFullName(String fullName);
    public abstract String toString();
    // you shouldn't actually call these functions cause this just a template for a person
    // whenever make person, have these
}
