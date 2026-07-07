package session18;

class MusicCheck implements Runnable {

    @Override
    public void run() {

        while (true) {

            System.out.println("Background music check running...");

            try {

                Thread.sleep(3000);

            } catch (InterruptedException e) {

                System.out.println(e.getMessage());

                break;

            }
        }
    }
}

public class solutation3 {

    public static void main(String[] args) {

        MusicCheck mc = new MusicCheck();

        Thread thread = new Thread(mc);

        thread.start();

    }
}