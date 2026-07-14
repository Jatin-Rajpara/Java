package session11;

abstract class UPITransaction {

    abstract void processTransaction(double amount);
}

class PaytmTransaction extends UPITransaction {

    @Override
    void processTransaction(double amount) {
        System.out.println("Paytm is processing " + amount);
    }
}

class PhonePeTransaction extends UPITransaction {

    @Override
    void processTransaction(double amount) {
        System.out.println("PhonePe is processing " + amount);
    }
}

public class solutation3 {

    public static void main(String[] args) {

        UPITransaction t1 = new PaytmTransaction();
        UPITransaction t2 = new PhonePeTransaction();

        t1.processTransaction(900);
        t2.processTransaction(7000);
    }
}
