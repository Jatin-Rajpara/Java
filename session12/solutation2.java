package session12;

import java.util.Scanner;

public class solutation2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Song Title: ");
        String song1 = sc.nextLine();

        System.out.print("Enter Second Song Title: ");
        String song2 = sc.nextLine();

        if (song1.equals(song2)) {
            System.out.println("Both song titles are exactly the same.");
        } else {
            System.out.println("Song titles are different.");
        }

        int result = song1.compareTo(song2);

        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println(song1 + " comes before " + song2);
        } else {
            System.out.println(song1 + " comes after " + song2);
        }

        sc.close();
    }
}