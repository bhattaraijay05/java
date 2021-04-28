
// 1 a. Design and create a class named Retail Item that holds data about an item in a retail store. The class should have the following fields:
// •	Description - The description field references a String object that holds a brief description of the item.
// •	Units - The units field is an int variable that holds the number of units currently in inventory.
// •	Price - The price field is a double that holds the item’s retail price.
// Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. Write the main method which creates three Retail Item objects and invokes appropriate methods.
import java.util.Scanner;

public class RetailItem {
    String description;
    int units;
    double price;

    RetailItem(String d, int u, double p) {
        description = d;
        units = u;
        price = p;
    }

    RetailItem() {
    };

    Scanner scan = new Scanner(System.in);

    void mutator() {
        System.out.println("\nEnter the details");
        System.out.println("Description of Item");
        description = scan.nextLine();
        System.out.println("Number of items");
        units = scan.nextInt();
        scan.nextLine();
        System.out.println("Price of item");
        price = scan.nextDouble();
        scan.nextLine();
    }

    void accessor() {
        System.out.println("\nDescription : " + description);
        System.out.println("Number of Items : " + units);
        System.out.println("Retail Price of Item : " + price);
    }

    public static void main(String[] args) {
        RetailItem r1 = new RetailItem("This is first description from the constructor", 20, 523.65);
        RetailItem r2 = new RetailItem("This is second description from the constructor", 40, 70.65);
        r1.accessor();
        r2.accessor();
        RetailItem r3 = new RetailItem();
        r3.mutator();
        r3.accessor();
    }
}
