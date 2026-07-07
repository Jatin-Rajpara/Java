package session3;

import java.util.Scanner;

public class solutation3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Cuisine: ");
            String cuisine = sc.nextLine();
            switch (cuisine) {
            case "Indian":
            System.out.println("Bawarchi");
            System.out.println("Rajdhani");
            System.out.println("Barbeque Nation");
            break;
            case "Chinese":
            System.out.println("Mainland China");

            System.out.println("China Town");
            System.out.println("Wow China");
            break;
            case "Italian":
            System.out.println("Pizza Hut");
            System.out.println("La Pino'z Pizza");
            System.out.println("Little Italy");
            break;
            case "Mexican":
            System.out.println("Taco Bell");
            System.out.println("California Burrito");
            System.out.println("Mexican Grill");
            break;

            default:
            System.out.println("No restaurants found for the selected cuisine.");

            }
    }
}
