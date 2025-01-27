import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChocolates = scanner.nextInt();
        int numberOfChildren = scanner.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Chocolates per child: " + result[1]);
        System.out.println("Remaining chocolates: " + result[0]);
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;

        return new int[]{remainder, quotient};
    }
}
