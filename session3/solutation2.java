package session3;
import java.util.Scanner;
public class solutation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.println("Kids Section");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teen Section");
        } else {
        System.out.println("Adult Section");
        }

    }
}
