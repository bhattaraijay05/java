import java.io.*;
import java.util.*;

class queue<T> {
    int front = -1, rear = -1;
    ArrayList<T> A = new ArrayList<>();

    T front() {
        if (front == -1)
            return null;
        return A.get(front);
    }

    T rear() {
        if (rear == -1)
            return null;
        return A.get(rear);
    }

    void enqueue(T X) {
        if (this.empty()) {
            front = 0;
            rear = 0;
            A.add(X);
        } else {
            front++;
            if (A.size() > front) {
                A.set(front, X);
            } else
                A.add(X);
        }
    }

    void dequeue() {
        if (this.empty())
            System.out.println("Queue is already empty");
        else if (front == rear) {
            front = rear = -1;
        } else {
            rear++;
        }
    }

    boolean empty() {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    public String toString() {
        if (this.empty())
            return "";
        String Ans = "";
        for (int i = rear; i < front; i++) {
            Ans += String.valueOf(A.get(i)) + " ";
        }
        Ans += String.valueOf(A.get(front));
        return Ans;
    }
}

class Test {
    public static void main(String args[]) {
        queue q1 = new queue<>();
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue("world");
        System.out.println(q1);
        q1.dequeue();
        System.out.println(q1);
        queue<String> q2 = new queue<>();
        q2.enqueue("hello");
        q2.enqueue("world");
        q2.enqueue("Java");
        System.out.println(q2);
    }
}