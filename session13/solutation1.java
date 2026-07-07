package session13;

public class solutation1 {

    public static void withdrawAmount(int balance, int amount) throws Exception {

        if (amount > balance) {
            throw new Exception("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("New Balance: " + balance);
        }
    }

    public static void main(String[] args) {

        try {
            withdrawAmount(5000, 2000);
            withdrawAmount(3000, 4000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}