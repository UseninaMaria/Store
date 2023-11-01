package ru.netology;

public enum Goods {
    MILK("Молоко", 95),
    EGGS("Яйца", 78),
    COFFEE("Кофе", 140),
    PASTA("Макароны", 86),
    BREAD("Хлеб", 54),
    WATER("Вода", 28),
    OIL("Масло", 110),
    SAUSAGE("Колбаса", 150);

    private final String name;
    private final int price;

    private Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
