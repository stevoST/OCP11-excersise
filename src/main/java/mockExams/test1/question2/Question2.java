package mockExams.test1.question2;

import java.util.Comparator;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book("dune", "scifi"), new Book("atlas shrugged", "scifi"));
        Comparator<Book> c1 =  (b1, b2)->b1.getGenre().compareTo(b2.getGenre());
        books.stream().sorted(c1.thenComparing(Book::getTitle));
        System.out.println(books);
    }
}
