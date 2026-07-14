package session18;

class NotificationUpdater implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println("You have new notifications!");

            try {

                Thread.sleep(5000);

            } catch (InterruptedException e) {

                System.out.println(e.getMessage());

            }
        }
    }
}

public class solutation1 {

    public static void main(String[] args) {

        NotificationUpdater nf = new NotificationUpdater();

        Thread thread = new Thread(nf);

        thread.start();

    }
}
