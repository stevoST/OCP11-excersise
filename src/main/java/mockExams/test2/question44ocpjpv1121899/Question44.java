package mockExams.test2.question44ocpjpv1121899;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question44 {

    private String title;
    private String genre;
    private String author;

    public Question44(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {

        List<Question44> test = Arrays.asList(
                new Question44("Book about arthur", "action", "Arthur"),
                new Question44("The forbidden book", "fantasy", "Came"),
                new Question44("Super Action text", "action", "Alot")
        );


//        Map<String, Map<String, List<Question44>>> classified = null;
        Map<String, Map<String, List<String>>> classified = null;
        classified = test.stream()
                .collect(Collectors.groupingBy(Question44::getGenre, Collectors.groupingBy(Question44::getAuthor, Collectors.mapping(Question44::getTitle, Collectors.toList()))));
        System.out.println(classified);
    }

}