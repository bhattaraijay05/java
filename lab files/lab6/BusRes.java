// 4 a. Consider a Bus reservation system that allows online reservations to its customers. Suppose there are two transactions of reservation for a particular seat simultaneously which leads to race  condition. Develop a solution to avoid the unpredictable situation with a program.

public class BusRes {
    public static void main(String[] args) {
        TicketBooking tkt = new TicketBooking();
        Thread thread1 = new Thread(tkt, "Taylor");
        Thread thread2 = new Thread(tkt, "Katy");
        thread1.start();
        thread2.start();
    }
}

class TicketBooking implements Runnable {
    int availableTicket = 1;

    public void run() {
        System.out.println("Customer in queue : " + Thread.currentThread().getName());
        synchronized (this) {
            if (availableTicket > 0) {
                System.out.println("\nAvailable Ticket = " + availableTicket);
                System.out.println("Booking ticket for " + Thread.currentThread().getName());
                availableTicket--;
                System.out.println("Ticket is booked for " + Thread.currentThread().getName());
                System.out.println("\nAvailable Ticket = " + availableTicket);
            } else {
                System.out.println("Ticket is not booked for " + Thread.currentThread().getName());
            }

        }

    }
}