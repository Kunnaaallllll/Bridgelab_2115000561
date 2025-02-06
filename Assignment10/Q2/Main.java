public class Main {
    public static void main(String[] args) {
        
        Bank bank = new Bank("Global Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, 1000);
        bank.openAccount(customer2, 500);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}