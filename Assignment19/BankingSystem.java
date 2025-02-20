import java.util.*;
public class BankingSystem {
    private static Map<Integer,Integer> accountMap=new HashMap<>();
    private static Map<Integer,Integer> sortedAccounts=new TreeMap<>(Comparator.comparing(accountMap::get));
    private static Queue<Integer> withdrawalQueue=new LinkedList<>();

    public static void addAccount(int accNo,int balance) {
        accountMap.put(accNo,balance);
        sortedAccounts.put(accNo,balance);
    }

    public static void requestWithdrawal(int accNo) {
        if(accountMap.containsKey(accNo)) {
            withdrawalQueue.add(accNo);
        }
    }
    public static void processWithdrawals() {
        while(!withdrawalQueue.isEmpty()) {
            int accNo=withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: "+accNo);
        }
    }
    public static void displayAccounts() {
        System.out.println("Accounts:");
        accountMap.forEach((accNo,balance)->System.out.println(accNo+":"+balance));
    }
    public static void displaySortedAccounts() {
        System.out.println("Sorted Accounts by Balance:");
        sortedAccounts.forEach((accNo,balance)->System.out.println(accNo+":"+balance));
    }
    public static void main(String[] args) {
        addAccount(101,5000);
        addAccount(102,15000);
        addAccount(103,10000);
        addAccount(104,7000);
        addAccount(105,20000);

        requestWithdrawal(102);
        requestWithdrawal(104);
        requestWithdrawal(101);

        displayAccounts();
        displaySortedAccounts();
        processWithdrawals();
    }
}
