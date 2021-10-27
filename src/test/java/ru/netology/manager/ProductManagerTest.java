package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);

    private Product first = new Book(1, "Непобедимое солнце", 240, "Виктор Пелевин");
    private Product second = new Book(2, "Лживая взрослая жизнь", 770, "Элена Ферранте");
    private Product third = new Book(3, "Пиши, сокращай", 740, "Максим Ильяхов");
    private Product fourth = new Book(4, "Будет кровь", 830, "Стивен Кинг");
    private Product fifth = new Book(5, "Как жаль что мои родители об этом не знали", 670, "Филиппа Перри");
    private Product sixth = new Book(6, "Мара и Морок", 490, "Лия Арден");
    private Product seventh = new Smartphone(7, "Realme 6 Pro", 22000, "Realme");
    private Product eighth = new Smartphone(8, "vivo V20", 30000, "Vivo");
    private Product ninth = new Smartphone(9, "Xiaomi Mi 10T Lite", 27000, "Xiaomi");
    private Product tenth = new Smartphone(10, "Samsung Galaxy M22", 19000, "Samsung");
    private Product eleventh = new Smartphone(11, "Samsung Galaxy A51", 17000, "Samsung");
    private Product twelfth = new Product(12, "Potato", 50);


    @BeforeEach
    public void shouldSaveAllProduct() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

    }

    @Test
    public void shouldSearchByName() {
        Product[] expected = new Product[]{second};
        Product[] actual = manager.searchBy("Лживая взрослая жизнь");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByName2() {
        Product[] expected = new Product[]{eleventh};
        Product[] actual = manager.searchBy("Samsung Galaxy A51");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByName3() {
        Product[] expected = new Product[]{tenth};
        Product[] actual = manager.searchBy("Samsung Galaxy M22");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByAuthor() {
        Product[] expected = new Product[]{fifth};
        Product[] actual = manager.searchBy("Филиппа Перри");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByName4() {
        Product[] expected = new Product[]{eighth};
        Product[] actual = manager.searchBy("vivo V20");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByManufacturer() {
        Product[] expected = new Product[]{ninth};
        Product[] actual = manager.searchBy("Xiaomi");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByColor() {
        Product[] expected = new Product[]{};
        Product[] actual = manager.searchBy("Potato");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByNameIfItIsNotTheOnlyOne() {
        Product[] expected = new Product[]{tenth, eleventh};
        Product[] actual = manager.searchBy("Samsung");
        assertArrayEquals(expected, actual);
    }

}