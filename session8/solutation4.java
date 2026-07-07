package session8;

public class solutation4 {

    String name;
    String description;

    solutation4() {
        this("My Playlist");
    }

    solutation4(String name) {
        this(name, "No Description");
    }

    solutation4(String name, String description) {
        this.name = name;
        this.description = description;
    }

    void display() {
        System.out.println("Playlist Name : " + name);
        System.out.println("Description : " + description);
    }

    public static void main(String[] args) {

        solutation4 p1 = new solutation4();
        solutation4 p2 = new solutation4("Workout Songs");
        solutation4 p3 = new solutation4("Party Songs", "Best dance hits");

        p1.display();
        System.out.println();

        p2.display();
        System.out.println();

        p3.display();
    }
}