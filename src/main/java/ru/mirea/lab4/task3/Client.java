package ru.mirea.lab4.task3;

import java.util.Scanner;
import java.util.Vector;

public class Client {
    public User session = null;
    public Vector<User> users = new Vector<>();
    public Vector<Product> assortment = new Vector<>();
    public void auth(String name, String password) {
        for(int i = 0; i < this.users.size(); i++) {
            if(this.users.elementAt(i).getName().equals(name) && this.users.elementAt(i).getPassword().equals(password)) {
                this.session = this.users.elementAt(i);
                System.out.println("User " + this.session.getName() + " signed in!");
                return;
            }
            System.out.println("Wrong username or password!");
        }
    }

    public void buyProduct(String name) {
        for(int i = 0; i < this.assortment.size(); i++) {
            if(this.assortment.elementAt(i).name.equals(name)) {
                this.session.userbasket.addProduct(this.assortment.elementAt(i));
                return;
            }
        }
        System.out.println("Not found!");
    }

    public static void main(String[] args) {
        Client client = new Client();
        //Загрузка товаров
        client.assortment.add(new Product(Products.Cola, 100, "Coca-cola"));
        client.assortment.add(new Product(Products.Chips, 150, "Lays"));
        client.assortment.add(new Product(Products.Cracker, 80, "Tuc"));
        client.assortment.add(new Product(Products.Chocolate, 40, "Twix"));
        client.assortment.add(new Product(Products.Cola, 120, "Pepsi"));
        client.assortment.add(new Product(Products.Chips, 140, "Estrella"));
        client.assortment.add(new Product(Products.Cracker, 90, "Lubyatovo"));
        client.assortment.add(new Product(Products.Chocolate, 50, "Snickers"));
        //Аутентификация пользователя
        client.users.add(new User("Vlad", "Vlad123", new Basket()));
        System.out.println("Введите имя и пароль: ");
        String username;
        String password;
        Scanner sc = new Scanner(System.in);
        username = sc.next();
        password = sc.next();
        client.auth(username, password);
        //Вывод товаров
        System.out.println("\nВсе товары:");
        for(int i = 0; i < client.assortment.size(); i++) {
            System.out.println(client.assortment.elementAt(i));
        }
        System.out.println("\nКола:");
        for(int i = 0; i < client.assortment.size(); i++) {
            if(client.assortment.elementAt(i).type.equals(Products.Cola)) {
                System.out.println(client.assortment.elementAt(i));
            }
        }
        System.out.println("\nЧипсы:");
        for(int i = 0; i < client.assortment.size(); i++) {
            if(client.assortment.elementAt(i).type.equals(Products.Chips)) {
                System.out.println(client.assortment.elementAt(i));
            }
        }
        System.out.println("\nКрекеры:");
        for(int i = 0; i < client.assortment.size(); i++) {
            if(client.assortment.elementAt(i).type.equals(Products.Cracker)) {
                System.out.println(client.assortment.elementAt(i));
            }
        }
        System.out.println("\nШоколад:");
        for(int i = 0; i < client.assortment.size(); i++) {
            if(client.assortment.elementAt(i).type.equals(Products.Chocolate)) {
                System.out.println(client.assortment.elementAt(i));
            }
        }
        //Добавление в корзину
        System.out.println("Введите наименование продукта:");
        String add = sc.next();
        client.buyProduct(add);
        System.out.println("Введите наименование продукта:");
        add = sc.next();
        client.buyProduct(add);
        //Вывод стоимости
        client.session.userbasket.buy();
    }
}
