package session8;

public class solutation2 {

    void addReview(int rating) {
        System.out.println("Rating : " + rating);
    }

    void addReview(int rating, String comment) {
        System.out.println("Rating : " + rating);
        System.out.println("Review : " + comment);
    }

    public static void main(String[] args) {

        solutation2 movie = new solutation2();

        movie.addReview(5);
        movie.addReview(4, "Excellent movie with great action scenes.");
    }
}