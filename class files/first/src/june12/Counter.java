class Counting {
    int c;

    public void increment() {
        c++;
    }
}

class Counter {
    public static void main(String[] args) {
        Counting c = new Counting();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (c) {
                    for (int i = 0; i < 10; i++) {
                        c.increment();
                        System.out.println("T1 " + c.c);
                    }
                }
            }
        });

        t1.start();
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (c) {
                    for (int i = 0; i < 5; i++) {
                        c.increment();
                        System.out.println("T2 " + c.c);
                    }
                }
            }
        });
        t2.start();
    }
}

// class Counting {
// int c;

// public synchronized void increment() {
// c++;
// }
// }

// class Counter {
// public static void main(String[] args) {
// Counting c = new Counting();
// Thread t1 = new Thread(new Runnable() {
// public void run() {
// for (int i = 0; i < 5; i++) {
// c.increment();
// System.out.println("T1 " + c.c);
// }

// }
// });

// t1.start();
// Thread t2 = new Thread(new Runnable() {
// public void run() {
// for (int i = 0; i < 5; i++) {
// c.increment();
// System.out.println("T2 " + c.c);
// }
// }
// });
// t2.start();
// // c.increment();
// // c.increment();
// }
// }
