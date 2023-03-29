package HW2A;

public class Employee extends Person {

    private long employeeId;
    private double monthlySalary;

    public Employee(String firstName, String lastName, long employeeId, double monthlySalary) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.monthlySalary = monthlySalary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
