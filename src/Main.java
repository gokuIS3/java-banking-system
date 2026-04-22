import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Account user = new Account(name, 0);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                bank.deposit(user, amt);

            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                bank.withdraw(user, amt);

            } else if (choice == 3) {
                bank.checkBalance(user);

            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}