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

    static void processWalletTopUp(PaymentMethod method, double amount) {
        method.topUp(amount);
    }

    public static void main(String[] args) {

        processWalletTopUp(new CardPayment(), 500);
        processWalletTopUp(new UpiPayment(), 500);
        processWalletTopUp(new CryptoPayment(), 500);
    }
}