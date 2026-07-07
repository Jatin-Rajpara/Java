package session10;

class PaymentMethod {

    void topUp(double amount) {
        System.out.println("Wallet Top-Up");
    }
}

class CardPayment extends PaymentMethod {

    @Override
    void topUp(double amount) {
        System.out.println("Card Payment: ₹" + amount);
    }
}

class UpiPayment extends PaymentMethod {

    @Override
    void topUp(double amount) {
        System.out.println("UPI Payment: ₹" + amount);
    }
}

class CryptoPayment extends PaymentMethod {

    @Override
    void topUp(double amount) {
        System.out.println("Crypto Payment: ₹" + amount);
    }
}

public class solutation3 {

    public static void main(String[] args) {

        PaymentMethod[] payments = {
                new CardPayment(),
                new UpiPayment(),
                new CryptoPayment()
        };

        for (PaymentMethod payment : payments) {
            payment.topUp(500);
        }
    }
}