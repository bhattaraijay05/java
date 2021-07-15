import java.io.*;
import java.util.*;

class stack<T> {
    ArrayList<T> A;
    int top = -1;
    int size;

    stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return A.get(top);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else
            top--;
    }

    boolean empty() {
        return top == -1;
    }

    public String toString() {
        String Ans = "";
        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + " ";
        }
        Ans += String.valueOf(A.get(top));
        return Ans;
    }
}

public class StackPrg {
    public static void main(String[] args) {
        stack s1 = new stack<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push("Jay");
        System.out.println("s1 after pushing 10, 20 and 30 :\n" + s1);
        s1.pop();
        System.out.println("s1 after pop :\n" + s1);

    }
}