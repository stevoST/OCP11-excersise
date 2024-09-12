package mockExams.test5.question36ocpjpv1121782;

import java.util.Arrays;
import java.util.List;

class Movie {
    static enum Genre {DRAMA, THRILLER, HORROR, ACTION}

    ;
    private Genre genre;
    private String name;
    private char rating = 'R';

    Movie(String name, Genre genre, char rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }
}

public class FilteringStuff {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("Titanic", Movie.Genre.DRAMA, 'U'),
                new Movie("Psycho", Movie.Genre.THRILLER, 'U'),
                new Movie("Oldboy", Movie.Genre.THRILLER, 'R'),
                new Movie("Shining", Movie.Genre.HORROR, 'U'));
        movies.stream()
                .peek(mov -> System.out.println(mov.getName()))
                .filter(mov -> mov.getRating() == 'R')
                .map(mov -> mov.getName())
                .forEach(System.out::println);
    }
}