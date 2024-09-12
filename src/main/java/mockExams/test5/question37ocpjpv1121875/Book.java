package mockExams.test5.question37ocpjpv1121875;

import java.util.Objects;

public class Book/* implements Comparable<Book>*/ {
    String isbn;
    String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

//    @Override
//    public int compareTo(Book o) {
//        return this.getIsbn().compareTo(o.getIsbn());
//    }
}
