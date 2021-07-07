import java.util.*;

class JavaExp {
    public static void main(String args[]) {

        LinkedList<String> list = new LinkedList<String>();

        LinkedList<String> llistobj = new LinkedList<String>();
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("String1");
        arraylist.add("String2");
        llistobj.addAll(arraylist);

        // Adding elements to the Linked list
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");

        // Adding an element to the first position
        list.addFirst("Negan");
        // Adding an element to the last position
        list.addLast("Rick");

        // Adding an element to the 3rd position
        list.add(2, "Glenn");
        list.add(arraylist);

        // Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}