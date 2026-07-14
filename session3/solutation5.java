package session3;

public class solutation5 {

    public static void min(int[] ratings, int minRating) {
        System.out.println("Ratings : " + minRating + ":");
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] >= minRating) {
                System.out.println(ratings[i]);
            }
        }
    }
    public static void main(String[] args) {
        
        int[] ratings = { 3,5,1,4,2,5,4 };
        int minRating = 3;
        min(ratings, minRating);
    }
}
