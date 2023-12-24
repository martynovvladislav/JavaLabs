package ru.mirea.lab4.task3;

import java.util.Vector;

public class Basket {
    public Vector<Product> basket = new Vector<>();

    public void addProduct(Product product) {
        this.basket.add(product);
        System.out.println(product + " added to basket!");
    }

    public void buy() {
        int sum = 0;
        for(int i = 0; i < this.basket.size(); i++) {
            sum += this.basket.elementAt(i).cost;
        }
        System.out.println("Полная стоимость товаров: " + sum);
    }
}
