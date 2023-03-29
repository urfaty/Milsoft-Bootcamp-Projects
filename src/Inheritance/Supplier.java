package Inheritance;

public class Supplier extends Person {
    private long suppliedId;
    private double totalCredit;

    public Supplier(String firstName, String lastName, long suppliedId, double totalCredit) {
        super(firstName, lastName);
        this.suppliedId = suppliedId;
        this.totalCredit = totalCredit;
    }

    public long getSuppliedId() {
        return suppliedId;
    }

    public void setSuppliedId(long suppliedId) {
        this.suppliedId = suppliedId;
    }

    public double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(double totalCredit) {
        this.totalCredit = totalCredit;
    }


    @Override
    public String getGreeting() {
        return "Selam Supplier";
    }
}
