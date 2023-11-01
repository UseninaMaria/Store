package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private static final int SIZE = 10; // Правило магических чисел
    private static List<Goods> basket = new ArrayList<>(SIZE);

public static List <Goods> acceptOrder () {
    System.out.println("Заказ оформлен!");
        return basket;
}
    public static void putInBasket(String name) {
        boolean found = false;
            if (basket.size() < SIZE) {
            for (Goods goods : Goods.values()) {
                if (goods.getName().equals(name)) {
                    basket.add(goods);
                    System.out.println("Вы добавили " + name + " в корзину!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(name + " нет в магазине!");
            }
        } else System.out.println("Корзина заполнена");
    }


    public static void removeFromBasket(String name) {
        if (basket.isEmpty()) {
            System.out.println("Ваша коризна пуста!");
        } else {
            for (Goods goods : basket) {
                if (goods.getName().equals(name)) {
                    basket.remove(goods);
                    System.out.println("Вы удалили " + name + " из корзины!");
                    break;
                } else {
                    System.out.println(name + " нет в корзине!");
                    break;
                }
            }
        }
    }

    public static void showBasket() {
        System.out.println("Список продуктов: ");
        if (basket.isEmpty()) {
            System.out.println("Ваша корзина пуста!");
        } else {
            for (Goods good : basket
            ) {
                System.out.println(good);
            }
        }
    }

    public static void cleanBasket() {
        if (basket.isEmpty()) {
            System.out.println("Ваша корзина пустая!");
        } else {
            basket.clear();
            System.out.println("Ваша корзина очищенна!");
        }
    }
}
