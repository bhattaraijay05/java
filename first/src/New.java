import java.util.Scanner;

public class New {
    int x = 5;

    public static void main(String[] args) {
        New myObj = new New();
        System.out.println(myObj.x);
        function();
        calc();
    }

    static void function() {
        System.out.println("I am a function!");
    }

    static void calc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();
        System.out.println("Enter the second number");
        int b = scan.nextInt();
        try {
            System.out.println("The division is " + (a / b));
        } catch (Exception e) {
            System.out.println(e);
        }
        scan.close();
    }
}
