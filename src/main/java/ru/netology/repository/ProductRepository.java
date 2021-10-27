package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository { // репозиторий позволяющий сохранять Product'ы, получать все сохранённые Product'ы и удалять по id
    private Product[] products = new Product[0]; // для этого репозиторий будет хранить у себя поле с типом Product[] (массив товаров)

    public void save(Product product) { // сохранение Product'а
        int length = products.length + 1; // // вычисляем и создаём новый массив размером на единицу больше
        Product[] tmp = new Product[length]; // создаём временный массив с новой длиной (на единицу больше)
        System.arraycopy(products, 0, tmp, 0, products.length);// копируем массив (откуда копируем, с какого места копируем, куда копируем, с какого места начать заполнение нового массива, кол-во элементов которое хотим скопировать)
        int lastIndex = tmp.length - 1; // добавляем последний новый продукт
        tmp[lastIndex] = product;
        products = tmp; // в поле продукт запоминает тот адрес массива который лежит в тмп
    }

    public Product[] findAll() { // получение Product'а
        return products; // при вызове метода возвращать массив всех продуктов
    }

    public void removeById(int id) { // удаление Product'а по id
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }
}
