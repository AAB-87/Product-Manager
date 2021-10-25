package ru.netology.domain;
import java.util.Objects;

public class Smartphone extends Product { // унаследованный от Product класса Smartphone с полем производитель
    private String manufacturer;

    public Smartphone() {
        super();
    } // конструктор без параметров

    public Smartphone(int id, String name, int price, String manufacturer) { // конструктор с параметрами родительскими и своим - manufacturer
        super(id, name, price); // вызов конструктора родителя
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        Smartphone smartphone = (smartphone) o;
//        return pages == book.pages &&
//                publishedYear == smartphone.publishedYear &&
//                Objects.equals(author, smartphone.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), author);
//    }
//
//    @Override
//    public String toString() {
//        return "Smartphone{" +
//                "author='" + author + '\'' +
//                '}';
//    }
}