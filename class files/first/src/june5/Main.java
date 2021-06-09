public class Main {
    int a;

    public static void main(String[] args) {
        Main1 m = new Main1();
        m.run();
        Thread th = new Thread(m);
        th.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("First  " + i);
        }
    }
}

class Main1 implements Runnable {
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println("Second  " + j);
        }
    }
}