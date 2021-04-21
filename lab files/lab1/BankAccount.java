// 2. Design and write a class to represent a bank account that includes the following members:
//    a. Data members:
//         owner name,account number, balance amount in the account
//    b. Methods members:
//        I) to assign initial values
//       ii) to deposit an amount
//       iii) to withdraw an amount after checking balance
//       iv) to display the owner name and balance
//    Write a main method for the above class that reads in the initial values from the keyboard.

import java.util.Scanner;

class BankAccount {
    String ownerName;
    Long accountNumber;
    int balance = 0;

    Scanner scan = new Scanner(System.in);

    void initialization() {
        System.out.println("Enter your name : ");
        ownerName = scan.nextLine();
        System.out.println("Enter your account number : ");
        accountNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter the balance in bank : ");
        balance = scan.nextInt();
        scan.nextLine();
    }

    void deposit() {
        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to deposit : ");
        int deposit = scan.nextInt();
        balance += deposit;
    }

    void withdraw() {
        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw : ");
        int withdraw = scan.nextInt();
        balance -= withdraw;
    }

    void display() {
        System.out.println("....Your Details.... ");
        System.out.println("Your Name : " + ownerName);
        System.out.println("Your Balance in Bank : " + balance);
    }

    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.initialization();
        user1.deposit();
        user1.withdraw();
        user1.display();
    }
}
