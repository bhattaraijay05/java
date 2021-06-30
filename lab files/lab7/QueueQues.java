import java.util.*;

class QueueTest<T> {
    LinkedList<T> Q = new LinkedList<>();
    int front = -1, rear = -1;

    void enqueue(T X) {
        front++;
        Q.add(X);
    }

    void dequeue() {
        if (this.empty())
            return;
        else if (front == rear) {
            front = rear = -1;
        } else {
            System.out.println(Q);
            System.out.println(front);
            System.out.println(rear);
            // Q.removeFirst();
            rear++;
            rear++;
            System.out.println(rear);
        }
    }

    void display() {
        if (!this.empty()) {
            System.out.println(Q);
        }
    }

    boolean empty() {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

}

class QueueQues {
    public static void main(String[] args) {
        QueueTest q1 = new QueueTest();
        q1.enqueue(1);
        q1.display();
        q1.enqueue(5.17);
        q1.enqueue("Jay");
        q1.display();
        q1.dequeue();
        q1.display();
    }
}
