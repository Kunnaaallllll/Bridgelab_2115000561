import java.util.*;

public class ThrowVsThrows {
    public static double calculateInterest(double amt, double rate, int time) throws IllegalArgumentException {
        if (amt < 0 || rate < 0)
            throw new IllegalArgumentException("Amount and rate must be positive.");
        return (amt * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter principal amount: ");
            double amt = sc.nextDouble();
            System.out.print("Enter interest rate (%): ");
            double rate = sc.nextDouble();
            System.out.print("Enter number of years: ");
            int time = sc.nextInt();

            double interest = calculateInterest(amt, rate, time);
            System.out.println(interest);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
