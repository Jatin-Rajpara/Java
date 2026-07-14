package session13;

public class solutation4 {

    public static void main(String[] args) {

        int[] transactions = {700,-800,600,-200,900};

       for (int i = 0; i < transactions.length; i++) {
            
            int amount = transactions[i];

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
