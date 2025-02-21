import java.util.*;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int size = sc.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter elements:");
            for (int i = 0; i < size; i++)
                arr[i] = sc.nextInt();

            System.out.print("Enter index to retrieve value: ");
            int idx = sc.nextInt();

            try {
                int val = arr[idx];
                System.out.print("Enter divisor: ");
                int div = sc.nextInt();

                try {
                    int res = val / div;
                    System.out.println("Result: " + res);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid numeric values.");
        }
    }
}
