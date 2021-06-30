
// Program to create a stack to store integer,double and student objects using generics.
import java.util.Stack;

class StackTest<T> {
    Stack<T> stk = new Stack<>();
    String student = "Student";

    void add(T a) {
        stk.push(a);
    }

    void display() {
        System.out.println(stk);
    }

    void delete() {
        stk.pop();
    }
}

class StackQues {
    public static void main(String[] args) {
        StackTest stk = new StackTest();
        stk.add(5);
        stk.add("15");
        stk.add(stk.student);
        stk.display();
        stk.delete();
        stk.display();
    }
}
