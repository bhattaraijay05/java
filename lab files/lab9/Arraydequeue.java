import java.util.ArrayDeque;

class Arraydequeue {

    public static void main(String[] args) {

        ArrayDeque adq = new ArrayDeque();
        adq.add(1);
        adq.add(2);
        adq.add(3);
        System.out.println(adq);
        adq.addFirst(100);
        System.out.println(adq);
        adq.addLast(500);
        System.out.println(adq);
        adq.clear();
        System.out.println(adq);
        // adq.display();
    }
}
