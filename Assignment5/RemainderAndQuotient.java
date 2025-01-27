import java.util.Scanner;

public class RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int divisor = scanner.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;

        return new int[]{remainder, quotient};
    }
}
