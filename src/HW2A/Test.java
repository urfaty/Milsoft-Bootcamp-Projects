package HW2A;

public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee("Edip","Akpınar",401,17500);
        System.out.println(employee.getEmployeeId() + " " + employee.getFirstName() + " " + employee.getLastName());
        employee.sendEmail(employee);

    }



}
