package ru.netology;

import java.util.Scanner;
import static ru.netology.Basket.*;
import static ru.netology.Store.showStore;

public class Main {
    public static void menu() {
        System.out.println(
                "1-Показать все товары\n" +
                        "2-Положить товар в корзину\n" +
                        "3-Удалить товар из козины\n" +
                        "4-Очистить корзину\n" +
                        "5-Показать корзину\n" +
                        "6-Оформить заказ\n" +
                        "Для выхода из магазина напишите \"end\""
        );
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите ваш адрес: ");
        String address = scanner.nextLine();

        System.out.print("Введите ваш контактный номер: ");
        String contactInfo = scanner.nextLine();

        Customer customer = new Customer(name, address, contactInfo);

        System.out.println("Здравствуйте! " + customer.getName() +
                "Выберите подходяший для Вас пункт:\n");

        while (true) {
            menu();
            String input = scanner.next();
            if (input.equals("end")) {
                System.out.println("Вы вышли из магазина. До свидания!");
                break;
            }
            switch (Integer.parseInt(input)) {
                case 1:
                    showStore();
                    break;
                case 2:
                    System.out.println("Выберите товар из списка ");
                    showStore();
                    String choiceGood = scanner.next();
                    putInBasket(choiceGood);
                    break;
                case 3:
                    System.out.println("Какой товар Вы хотите удалить из корзины?");
                    showBasket();
                    String choice = scanner.next();
                    removeFromBasket(choice);
                    break;
                case 4:
                    cleanBasket();
                    break;
                case 5:
                    showBasket();
                    break;
                case 6:
                    acceptOrder();
                    break;
                default:
                    System.out.println("Такой команды нет!\n");
            }
        }
    }
}