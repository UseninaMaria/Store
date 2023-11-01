package ru.netology;

public class Store   {
    public static void showStore() {
        System.out.println("В нашем магазине можно купить: ");
        System.out.printf("%-10s %-10s%n", "Товар ", "Цена");
        System.out.println("---------------------");
        for (Goods goods : Goods.values()) {
            System.out.printf("%-10s %-10s%n", goods.getName(), goods.getPrice());
        }
        System.out.println("---------------------");
    }
}
