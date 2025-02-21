import java.util.*;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        this.balance = balance;
    }

    public void withdraw(double amt) throws InsufficientBalanceException {
        if (amt < 0)
            throw new IllegalArgumentException("Invalid amount! Amount must be positive.");
        if (amt > balance)
            throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amt;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}
public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();
            BankAccount account = new BankAccount(initialBalance);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);

        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
