import java.util.HashSet;

class Books {

    int id, quantity;
    String name, author;

    public Books(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

}

class Hashset {
    public static void main(String[] args) {
        HashSet<Books> hset = new HashSet<Books>();
        Books b1 = new Books(1, "Book1", "Author 1", 50);
        Books b2 = new Books(2, "Book2", "Author 2", 60);
        Books b3 = new Books(3, "Book3", "Author 3", 70);
        hset.add(b1);
        hset.add(b2);
        hset.add(b3);

        // System.out.println(hset);

        for (Books b : hset) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }

        hset.remove(b3);

        System.out.println("\n");

        for (Books b : hset) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }

        hset.clear();
        for (Books b : hset) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }

    }
}
