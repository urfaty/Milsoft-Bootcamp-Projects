package Inheritance;

public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer("Cem", "Karaca", 301, 6540);
        customer.setEmailAdress("cem@godoro.com");
        Person person = new Customer("Barış", "Manço", 302, 7620);
        person.setEmailAdress("baris@godoro.com");
        Supplier supplier = new Supplier("Fikret", "Kızılok", 7018795, 7620);
        supplier.setEmailAdress("fikret@godoro.com");



        if(person instanceof Customer customerPerson) {
            customerPerson.setCustomerId(302);
            customerPerson.setTotalDebit(7235);
        }

        System.out.println(customer.getGreeting()+ " " + customer.getFullName());
        System.out.println(person.getGreeting()+ " " + person.getFullName());
        System.out.println(supplier.getGreeting()+ " " + supplier.getFullName());

        sendMail(customer);
        sendMail(person);
        sendMail(supplier);
    }

    private static void sendMail (Person person) {
        System.out.println();
        System.out.println("Kime: " + person.getEmailAdress() );
        System.out.println("Konu: " + person.getGreeting() );
        System.out.println("Gövde: " + person.getFullName() );
    }

}
