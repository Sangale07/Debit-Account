public class Main {
    public static void main(String[] args) {
        System.out.println("Debit Account Program");
        Account account = new Account(100.0);


        System.out.printf("Initial account balance: %.2f%n", account.getBalance());


        System.out.println("Attempting to debit 50.0 from the account.");
        account.debit(50.0);
        System.out.printf("Account balance after debit: %.2f%n", account.getBalance());
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
    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }
}