package session3;

public class solutation5 {

    public static void filterByMinRating(int[] ratings, int minRating) {
        System.out.println("Ratings Greater Than or Equal to" + minRating + ":");
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] >= minRating) {
                System.out.println(ratings[i]);
            }
        }
    }
    public static void main(String[] args) {
        
        int[] ratings = { 4, 5, 3, 2, 5, 1, 4 };
        int minRating = 4;
        filterByMinRating(ratings, minRating);
    }
}
