package ru.netology;

abstract public class User {
    private String name;
    private String address;
    private String info;

    public User(String name, String address, String info) {
        this.name = name;
        this.address = address;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInfo() {
        return info;
    }
}


