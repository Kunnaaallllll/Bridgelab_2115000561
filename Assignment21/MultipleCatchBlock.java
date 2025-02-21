import java.util.*;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        try{
            int[] arr = n > 0 ? new int[n] : null;
            if(arr != null){
                System.out.println("Enter elements:");
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
            }
            System.out.print("Enter index to retrieve value: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
