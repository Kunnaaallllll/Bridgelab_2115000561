import java.util.*;

class SortStackRecursion {
    public static void sort(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int temp = st.pop();
        sort(st);
        correctPos(st, temp);
    }

    public static void correctPos(Stack<Integer> st, int temp) {
        if (st.isEmpty() || st.peek() <= temp) {
            st.push(temp);
            return;
        }
        int temp2 = st.pop();
        correctPos(st, temp);
        st.push(temp2);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(1);
        st.push(4);
        st.push(5);
        st.push(3);
        System.out.println(st);
        sort(st);
        System.out.println(st);
    }
}
