package session7;

public class solutation2 {

    int price;
    static int totaltc = 0;

    void bookTicket(int amount) {
        totaltc += amount;
    }

    static void check() {
        System.out.println("Total Tickets Booked: " + totaltc);
    }

    public static void main(String[] args) {

        solutation2 t1 = new solutation2();
        solutation2 t2 = new solutation2();

        t1.bookTicket(2);
        t2.bookTicket(3);

        solutation2.checks();
    }
}
