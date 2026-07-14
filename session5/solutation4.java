package session5;

public class solutation4 {

    public static void main(String[] args) {

        char[][] seats = {
                {'A', 'B', 'A', 'A', 'B', 'A'},
                {'B', 'A', 'A', 'B', 'A', 'A'},
                {'A', 'A', 'B', 'A', 'A', 'B'},
                {'A', 'B', 'A', 'A', 'A', 'A'},
                {'B', 'A', 'A', 'B', 'A', 'A'}
        };

        int av = 0;

        for (int row = 0; row < seats.length; row++) {

            for (int col = 0; col < seats[row].length; col++) {

                if (seats[row][col] == 'A') {
                    av++;
                }
            }
        }

        System.out.println("Available Seats : " + av);
    }
}
