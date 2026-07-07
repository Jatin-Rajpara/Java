package session12;

public class solutation3 {

    public static void main(String[] args) {

        StringBuilder orderID = new StringBuilder("ORD");

        int randomNumber = 100000 + (int) (Math.random() * 900000);

        orderID.append(randomNumber);

        System.out.println("Generated Order ID: " + orderID);
    }
}