package ru.mirea.lab4.task3;

public class User {
    private String name;
    private String password;
    public Basket userbasket;

    public User(String name, String password, Basket userbasket) {
        this.name = name;
        this.password = password;
        this.userbasket = userbasket;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
