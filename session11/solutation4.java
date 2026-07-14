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
        
        String key = keyword.toLowerCase();

        for (int i = 0; i < movies.length; i++) {
            
            String movie = movies[i];
            
            if (movie.toLowerCase().contains(key)) {
                System.out.println(movie);
            }
        }
    }

    public static void main(String[] args) {

        solutation4 library = new solutation4();

        library.search("man");
    }
}
