public class BankAccount {
    String ownerName = "Jay Bhattarai";
    int accountNumber = 125478565;
    int balance = 0;

    void initialization(int bal) {
        balance = bal;
    }

    void deposit(int dep) {
        balance += dep;
    }

    void withdraw(int withdraw) {
        balance -= withdraw;
    }

    void display() {
        System.out.println("....Your Details.... ");
        System.out.println("Your Name : " + ownerName);
        System.out.println("Your Balance in Bank : " + balance);
    }

    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();

        int balance = Integer.parseInt(args[0]);
        int deposit = Integer.parseInt(args[1]);
        int withdraw = Integer.parseInt(args[2]);

        user1.initialization(balance);
        user1.deposit(deposit);
        user1.withdraw(withdraw);
        user1.display();
    }
}
