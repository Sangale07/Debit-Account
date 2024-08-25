public class Main {
    public static void main(String[] args) {
        System.out.println("Debit Account Program");
    }
}
class Account {
    private double balance;

    // Constructor to initialize the account with a balance
    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            this.balance = initialBalance;
        }
    }
}