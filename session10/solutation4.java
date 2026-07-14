package session10;

class PaymentMethod4 {

    void pay(double amount) {
        System.out.println("Payment of " + amount + " processed.");
    }
}

class UpiPayment4 extends PaymentMethod4 {

    @Override
    void pay(double amount) {
        System.out.println("UPI Payment of " + amount + " successful.");
    }
}

public class solutation4 {

    void pay(double amount) {
        System.out.println("Paid " + amount);
    }

    void pay(double amount, String Code) {
        System.out.println("Paid " + amount + " using Coupon: " + Code);
    }

    void pay(double amount, double bal) {
        System.out.println("Paid " + amount + " using Wallet Balance: " + bal);
    }

    public static void main(String[] args) {

        solutation4 payment = new solutation4();

        payment.pay(800);
        payment.pay(800, "SAVE50");
        payment.pay(800, 2000);

        System.out.println();

        PaymentMethod4 method = new UpiPayment4();
        method.pay(800);
    }
}
