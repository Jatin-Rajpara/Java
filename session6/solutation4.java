package session6;

public class solutation4 {

    String movieTitle;
    String seatNo;

    solutation4(String movieTitle, String seatNo) {
        this.movieTitle = movieTitle;
        this.seatNo = seatNo;
    }

    void printTicket() {
        System.out.println("Movie Title : " + movieTitle);
        System.out.println("Seat Number : " + seatNo);
    }

    public static void main(String[] args) {

        solutation4 ticket = new solutation4("Avengers: DoomsDay", "A09");

        ticket.printTicket();
    }
}
