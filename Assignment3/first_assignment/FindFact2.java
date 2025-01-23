import java.util.*;
public class FindFact2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}