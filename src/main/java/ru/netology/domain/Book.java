package ru.netology.domain;
import java.util.Objects;

public class Book extends Product { // унаследованный от Product класса Book с полем автор
    private String author;

    public Book() {
        super();
    } // конструктор без параметров

    public Book(int id, String name, int price, String author) { // конструктор с параметрами родительскими и своим - author
        super(id, name, price); // вызов конструктора родителя
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Book book = (Book) o;
//        return pages == book.pages &&
//                publishedYear == book.publishedYear &&
//                Objects.equals(author, book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), author);
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "author='" + author + '\'' +
//                '}';
//    }
}