package session18;

class CashbackThread extends Thread {

    int cashback = 0;

    @Override
    public void run() {

        for (int i = 1; i <= 6; i++) {

            cashback += 10;

            System.out.println("Cashback Added: 10");
            System.out.println("Current Cashback: " + cashback);

            try {

                Thread.sleep(10000);

            } catch (InterruptedException e) {

                System.out.println(e.getMessage());

            }
        }

        System.out.println("Final Cashback Balance: " + cashback);
    }
}

public class solutation2 {

    public static void main(String[] args) {

        CashbackThread thread = new CashbackThread();

        thread.start();

    }
}