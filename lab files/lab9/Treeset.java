import java.util.TreeSet;

class Treeset {
    public static void main(String[] args) {
        TreeSet tset = new TreeSet();
        tset.add(1);
        tset.add(2);
        tset.add(3);
        tset.add(4);
        tset.add(5);
        tset.add(6);

        System.out.println(tset);

        System.out.println("Removed " + tset.pollFirst());
        System.out.println(tset);

        System.out.println("Removed: " + tset.pollLast());
        System.out.println(tset);

    }
}
