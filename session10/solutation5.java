package session10;

class PaymentMethod5 {

    void topUp(double amount) {
        System.out.println("Wallet topped up.");
    }
}

class CardPayment5 extends PaymentMethod5 {

    @Override
    void topUp(double amount) {

        if (amount > 1000) {
            System.out.println("Card Payment: " + amount);
            System.out.println("Congratulations! You received 10% cashback.");
        } else {
            System.out.println("Card Payment: " + amount);
        }
    }
}

public class solutation5 {

    public static void main(String[] args) {

        CardPayment5 card = new CardPayment5();

        card.topUp(600);
        card.topUp(2500);
    }
}
