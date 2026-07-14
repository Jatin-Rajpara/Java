package session10;

class PaymentMethod {

    void topUp(double amount) {
        System.out.println("Wallet topped up with ₹" + amount);
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

public class solutation2 {

    static void TopUp(PaymentMethod method, double amount) {
        method.topUp(amount);
    }

    public static void main(String[] args) {

        TopUp(new CardPayment(), 300);
        TopUp(new UpiPayment(), 300);
        TopUp(new CryptoPayment(), 300);
    }
}
