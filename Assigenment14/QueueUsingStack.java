import java.util.*;

public class QueueUsingStack {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);

        queue.isEmpty();
        System.out.println(queue.peek() == -1 ? "Queue is Empty" : queue.dequeue());
        System.out.println(queue.peek() == -1 ? "Queue is Empty" : queue.dequeue());
        System.out.println(queue.peek() == -1 ? "Queue is Empty" : queue.dequeue());
        System.out.println(queue.peek() == -1 ? "Queue is Empty" : queue.dequeue());
        System.out.println(queue.peek() == -1 ? "Queue is Empty" : queue.dequeue());
        System.out.println(queue.peek() == -1 ? "Queue is Empty" : queue.peek());
    }
}

class QueueUsingStacks {
    Stack<Integer> enqueueStack = new Stack<>();
    Stack<Integer> dequeueStack = new Stack<>();

    public void enqueue(int num) {
        enqueueStack.push(num);
    }

    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty())
                dequeueStack.push(enqueueStack.pop());
        }
        if (dequeueStack.isEmpty()) {
            return -1;
        }
        return dequeueStack.pop();
    }

    public int peek() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty())
                dequeueStack.push(enqueueStack.pop());
        }
        if (dequeueStack.isEmpty()) {
            return -1;
        }
        return dequeueStack.peek();
    }

    public void isEmpty() {
        if (enqueueStack.isEmpty() && dequeueStack.isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Queue is not Empty");
        }
    }
}
