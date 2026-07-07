package session5;

public class solutation3 {

    public static void main(String[] args) {

        double[] orders = {
                250.50, 400.00, 180.75, 600.00, 320.25,
                150.00, 275.50, 500.00, 225.75, 350.00
        };

        double total = 0;
        double min = orders[0];
        double max = orders[0];

        for (int i = 0; i < orders.length; i++) {

            total += orders[i];

            if (orders[i] < min) {
                min = orders[i];
            }

            if (orders[i] > max) {
                max = orders[i];
            }
        }

        System.out.println("Total Spent : " + total);
        System.out.println("Minimum Order : " + min);
        System.out.println("Maximum Order : " + max);
    }
}