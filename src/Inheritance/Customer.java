package Inheritance;

public class Customer extends Person {


    public Customer(String firstName, String lastName, long customerId, double totalDebit) {
        super(firstName, lastName);
        this.customerId = customerId;
        this.totalDebit = totalDebit;
    }

    private long customerId;
    private double totalDebit;


    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public double getTotalDebit() {
        return totalDebit;
    }

    public void setTotalDebit(double totalDebit) {
        this.totalDebit = totalDebit;
    }

    @Override
    public String getFullName() {
        return lastName + ", " + firstName;
    }

    @Override
    public String getGreeting() {
        return  "Merhaba Customer";
    }

}
