package session5;

public class solutation1 {

    public static void main(String[] args) {


        String[] recentSearches = {
                "Mobile",
                "Laptop",
                "Headphones",
                "Shoes",
                "Watch",
                "Camera",
                "Keyboard",
                "Mouse",
                "Power Bank",
                "Smart TV"
        };

        
        System.out.println("Recent Searches:");

        for (int i = 0; i < recentSearches.length; i++) {
            System.out.println(recentSearches[i]);
        }
    }
}