package session10;

class PaymentMethod {

    void topUp(double amount) {
        System.out.println("Wallet topped up with ₹" + amount);
    }
}

class CardPayment extends PaymentMethod {

    @Override
    void topUp(double amount) {
        System.out.println("Wallet topped up using Card Payment: ₹" + amount);
    }
}

class UpiPayment extends PaymentMethod {

    @Override
    void topUp(double amount) {
        System.out.println("Wallet topped up using UPI Payment: ₹" + amount);
    }
}

class CryptoPayment extends PaymentMethod {

    @Override
    void topUp(double amount) {
        System.out.println("Wallet topped up using Crypto Payment: ₹" + amount);
    }
}

public class solutation1 {

    public static void main(String[] args) {

        CardPayment card = new CardPayment();
        UpiPayment upi = new UpiPayment();
        CryptoPayment crypto = new CryptoPayment();

        card.topUp(700);
        upi.topUp(700);
        crypto.topUp(700);
    }
}
