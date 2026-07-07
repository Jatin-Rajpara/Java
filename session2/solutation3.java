package session2;

public class solutation3 {
    public static void main(String[] args) {
        int userAge = 20;
        boolean hasPaymentMethod = true;

        if (userAge >= 18 && hasPaymentMethod) {
        System.out.println("Booking allowed");
        } else {
        System.out.println("Booking not allowed");
        }
    }
}
