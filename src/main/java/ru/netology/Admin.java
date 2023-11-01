package ru.netology;

public class Admin extends User {

    private int accessLevel;

    public Admin(String name, String address, String info, int accessLevel) {
        super(name, address, info);
        this.accessLevel = accessLevel;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    private void changeName (Customer customer, String name) {
        //Админ может менять по запросу имя пользователя
    }
}
