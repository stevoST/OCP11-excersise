package mockExams.test5.question37ocpjpv1121875;

import java.util.ArrayList;
import java.util.List;

public class Question37 {
    public static void main(String[] args) {
//        List<Book> books = getBooksByAuthor("Ludlum");
        List<Book> books = new ArrayList<>();
        Book book = new Book("isbn2", "title2");
        Book book2 = new Book("isbn", "title");
        books.add(book);
        books.add(book2);
        books.stream()
                .sorted()
                .forEach(b -> System.out.println(b.getIsbn())); //1
    }
}
