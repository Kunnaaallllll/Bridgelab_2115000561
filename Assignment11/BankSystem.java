class BankAccount {
    String accountNumber;
    double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "% per year");
    }
}
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Daily Withdrawal Limit: " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount {
    int tenure;
    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " months");
    }
}
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Kun123", 5000.0, 4.5);
        CheckingAccount checking = new CheckingAccount("Aru456", 3000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("ayu789", 10000.0, 24);
        System.out.println("savings account details");
        savings.displayBalance();
        savings.displayAccountType();
        System.out.println("checking account details");
        checking.displayBalance();
        checking.displayAccountType();
        System.out.println("fixed deposit Account details");
        fixedDeposit.displayBalance();
        fixedDeposit.displayAccountType();
    }
}
