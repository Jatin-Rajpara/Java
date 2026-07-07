package session8;

public class solutation5 {

    void registerUser(String email) {
        System.out.println("Email : " + email);
    }

    void registerUser(String email, String password) {
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
    }

    void registerUser(String email, String password, String phone) {
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Phone : " + phone);
    }

    public static void main(String[] args) {

        solutation5 user = new solutation5();

        user.registerUser("user@gmail.com");
        System.out.println();

        user.registerUser("user@gmail.com", "Password123");
        System.out.println();

        user.registerUser("user@gmail.com", "Password123", "9876543210");
    }
}