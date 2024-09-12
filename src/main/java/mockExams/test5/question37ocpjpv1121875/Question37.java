package mockExams.test5.question37ocpjpv1121875;

import java.util.ArrayList;
import java.util.List;

public class Question37 {
    public static void main(String[] args) {
//        List<Book> books = getBooksByAuthor("Ludlum");
        List<Book> books = new ArrayList<>();
        Book book = new Book("a", "title");
        Book book3 = new Book("isbn2", "title2");
        Book book2 = new Book("isbn3", "title1");
        Book book4 = new Book("isbn", "title3");
        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.stream()
                .sorted()
//                .sorted((o1, o2) -> o2.getIsbn().compareTo(o1.getIsbn()))
//                .sorted(Comparator.comparing(Book::getIsbn))
                .forEach(b -> System.out.println(b.getIsbn())); //1
    }
}
