package session13;

public class solutation4 {

    public static void main(String[] args) {

        int[] transactions = {500, -200, 700, -100, 1000};

        for (int amount : transactions) {

            try {

                if (amount < 0) {
                    throw new Exception("Invalid Transaction Amount: " + amount);
                }

                System.out.println("Transaction Processed: " + amount);

            } catch (Exception e) {

                System.out.println(e.getMessage());

            } finally {

                System.out.println("Transaction Complete");
            }
        }
    }
}