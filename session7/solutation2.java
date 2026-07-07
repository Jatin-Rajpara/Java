package session7;

public class solutation2 {

    int price;
    static int totalTickets = 0;

    void bookTicket(int amount) {
        totalTickets += amount;
    }

    static void checkTotalTickets() {
        System.out.println("Total Tickets Booked: " + totalTickets);
    }

    public static void main(String[] args) {

        solutation2 t1 = new solutation2();
        solutation2 t2 = new solutation2();

        t1.bookTicket(2);
        t2.bookTicket(3);

        solutation2.checkTotalTickets();
    }
}