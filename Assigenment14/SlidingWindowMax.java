import java.util.*;
class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        if (arr.length == 0) return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (!dq.isEmpty() && dq.peek() < i - k + 1) dq.poll();

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) dq.pollLast();

            dq.offer(i);

            if (i >= k - 1) result[i - k + 1] = arr[dq.peek()];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
}