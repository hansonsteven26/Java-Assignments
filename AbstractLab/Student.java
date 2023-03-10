package AbstractLab;

public class Student extends Person implements Bills {
    
    private String fullName;

    @Override
    public double taxes(double amount) {
        return amount * 0.02;
    }

    @Override
    public double calculateTelePhoneBill(double amount) {
        return this.taxes(amount) + amount;
    } // this.taxes uses that taxes method and not the abstract one. this refers to in that class itself

    @Override
    public double gasBill(double amount) {
        return this.taxes(amount) + amount;
    }

    @Override
    public double carInsurance(double amount) {
        return this.taxes(amount) + amount;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Employee [fullName= " + fullName + "]";
    }
}
