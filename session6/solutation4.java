package session6;

public class solutation4 {

    String movieTitle;
    String seatNumber;

    solutation4(String movieTitle, String seatNumber) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
    }

    void printTicket() {
        System.out.println("Movie Title : " + movieTitle);
        System.out.println("Seat Number : " + seatNumber);
    }

    public static void main(String[] args) {

        solutation4 ticket = new solutation4("Avengers: Endgame", "B12");

        ticket.printTicket();
    }
}