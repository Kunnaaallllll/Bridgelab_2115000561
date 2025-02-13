import java.util.*;
class StockSpan {
    public static ArrayList<Integer> calculateSpan(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> span = new ArrayList<>(Collections.nCopies(n, 0));
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr.get(st.peek()) <= arr.get(i)) {
                st.pop();
            }
            span.set(i, st.isEmpty() ? (i + 1) : (i - st.peek()));
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 4, 5, 90, 120, 80));
        ArrayList<Integer> span = calculateSpan(arr);
        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}
