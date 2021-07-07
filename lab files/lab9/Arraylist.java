import java.util.ArrayList;

class Arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer> alist = new ArrayList<Integer>();
        ArrayList alist = new ArrayList();
        alist.add("a");
        alist.add("b");
        alist.add("c");
        alist.add("d");
        alist.add(5);
        // alist.display();
        System.out.println(alist);
        alist.remove("c");
        // alist.display();
        System.out.println(alist);
        alist.remove("b");
        // alist.display();
        System.out.println(alist);
        alist.clear();
        System.out.println(alist);
    }
}
