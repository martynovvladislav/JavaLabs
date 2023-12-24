package ru.mirea.lab4.task3;

public class Product {
    public Products type;
    public int cost;
    public String name;

    public Product(Products type, int cost, String name) {
        this.type = type;
        this.cost = cost;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.type.name() + " " + this.name + " " + this.cost;
    }
}
