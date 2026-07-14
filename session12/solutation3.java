package session12;

public class solutation3 {

    public static void main(String[] args) {

        StringBuilder ID = new StringBuilder("ORD");

        int no = 100000 + (int) (Math.random() * 900000);

          ID.append(no);

        System.out.println("Generated Order ID: " + ID);
    }
}
