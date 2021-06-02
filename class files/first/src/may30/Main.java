import java.util.Scanner;

public class Main {
    static void checkAge(int age) {
        // if (age < 18) {
        // throw new ArithmeticException("Access denied - You must be at least 18 years
        // old.");
        // } else if (age > 200) {
        // throw new ArithmeticException("You are probably dead");
        // } else {
        // System.out.println("Access granted - You are old enough!");
        // }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age");
        int a = scan.nextInt();
        scan.nextLine();
        scan.close();
        try {
            if (a < 18) {
                throw new ArithmeticException("Access denied");
            } else if (a > 200) {
                throw new NumberFormatException("You are probably no more");
            } else {
                System.out.println("Access granted");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("Done");
        }

    }

    // static void setRadius(double newRadius) throws IllegalArgumentException {
    // if (newRadius >= 0)
    // radius = newRadius;
    // else
    // throw new IllegalArgumentException("Radius cannot be negative");
    // }

    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18...)
        // setRadius(2);
    }
}