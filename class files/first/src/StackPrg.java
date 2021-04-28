import java.util.Stack;

public class StackPrg {

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(20);
        stk.push(50);
        stk.push(70);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
    }
}
