import java.util.*;
class LinearSearchNegativeNumbers{
	public static int firstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements:");
        int n = sc.nextInt();
		
		int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
		
		int ans = firstNegative(arr);
		System.out.println("Index: "+ans);
	}
}