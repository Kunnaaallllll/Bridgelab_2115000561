import java.util.*;
class CompareRecursiveAndInterative{
	public static int recursive(int N) {
		if (N <= 1) return N;
		return recursive(N - 1) + recursive(N - 2);
	}
	public static int interative(int N) {
		int a = 0, b = 1, sum;
		for (int i = 2; i <= N; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}

	public static void main(String[]args){
		int N = 10;
		long recursiveStart = System.nanoTime();
		int num = recursive(N);
		long recursiveEnd = System.nanoTime();
		System.out.println("Time Taken by Recursive Approach: "+(recursiveEnd-recursiveStart)/1e6+" ms.");
		
		long interativeStart = System.nanoTime();
		int num1 = interative(N);
		long iterativeEnd = System.nanoTime();
		System.out.println("Time Taken by Iterative Approach: "+(iterativeEnd-interativeStart)/1e6+" ms.");
	}
}