public class BankService {

    public void deposit(Account acc, double amount) {
        acc.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(Account acc, double amount) {
        if (amount > acc.balance) {
            System.out.println("Insufficient balance");
        } else {
            acc.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void checkBalance(Account acc) {
        System.out.println("Balance: " + acc.balance);
    }
}