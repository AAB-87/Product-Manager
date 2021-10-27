package ru.netology.domain;
import java.util.Objects;

public class Headphones extends Product { // унаследованный от Product класса Headphones с полем автор
    private String color;

    public Headphones() { super(); } // конструктор без параметров

    public Headphones(int id, String name, int price, String color) { // конструктор с параметрами родительскими и своим - color
        super(id, name, price); // вызов конструктора родителя
        this.color = color;
    }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}
