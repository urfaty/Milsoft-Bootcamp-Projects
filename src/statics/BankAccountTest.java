package statics;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount.setRate(24);

        BankAccount account1 = new BankAccount();
        account1.setInvestment(500);
        BankAccount.setRate(36);
        System.out.println("Tutar: 09 " + account1.getAmount(9));
        System.out.println("Tutar: 12 " + account1.getAmount());


        BankAccount account2 = new BankAccount();
        account2.setInvestment(800);
        System.out.println("Tutar: 09 " + account2.getAmount(9));
        System.out.println("Tutar: 12 " + account2.getAmount());

    }
}
