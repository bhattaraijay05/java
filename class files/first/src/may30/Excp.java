import java.util.Scanner;

abstract class Ab {
    abstract void display();
}

// private class A {
// int a = 10;

// void display() {
// System.out.println(a);
// }
// }

public class Excp {
    public static void main(String[] args) {
        // A aa = new A();
        // Ab b = new Ab();

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the number");
            int a = scan.nextInt();
            scan.nextLine();
            scan.close();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("We got error");
        } finally {
            System.out.println("Number is ");
        }

        // String str = null;

        // try {
        // System.out.println(str.length());
        // } catch (Exception e) {
        // System.out.println("Error");
        // }

        // int[] myNumbers = { 1, 2, 3 };
        // System.out.println(myNumbers[10]); // error!

        // try {
        // int[] myNumbers = { 1, 2, 3 };
        // System.out.println(myNumbers[10]);
        // } catch (Exception e) {
        // System.out.println("Something went wrong.");
        // } finally {
        // System.out.println("The 'try catch' is finished.");
        // }

    }
}
