import java.util.*;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
