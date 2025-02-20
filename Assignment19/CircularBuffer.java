import java.util.*;

public class CircularBuffer {
    int[] buffer;
    int size, front, rear;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void insert(int x) {
        if (size == buffer.length) {
            front = (front + 1) % buffer.length;
        } else {
            size++;
        }
        buffer[rear] = x;
        rear = (rear + 1) % buffer.length;
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(buffer[(front + i) % buffer.length]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        System.out.println(cb.getBuffer());
    }
}
