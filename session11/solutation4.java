package session11;

interface Searchable {

    void search(String keyword);
}

public class solutation4 implements Searchable {

    String[] movies = {
            "Avengers",
            "Avatar",
            "Batman",
            "Spider-Man",
            "Iron Man",
            "The Batman"
    };

    @Override
    public void search(String keyword) {

        System.out.println("Search Results:");

        for (String movie : movies) {
            if (movie.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(movie);
            }
        }
    }

    public static void main(String[] args) {

        solutation4 library = new solutation4();

        library.search("man");
    }
}