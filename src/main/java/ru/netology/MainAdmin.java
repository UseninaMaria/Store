package ru.netology;

public class MainAdmin extends Admin{
    public MainAdmin(String name, String address, String info, int accessLevel) {
        super(name, address, info, accessLevel);
    }
    private Admin recruit (Admin admin) {
        // Главный админ, может принимать на работу обычных админов
        return new Admin("Alex","Moscow", "clever man", 4 );
    }
}
