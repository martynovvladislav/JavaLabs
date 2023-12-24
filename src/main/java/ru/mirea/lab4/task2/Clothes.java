package ru.mirea.lab4.task2;

public abstract class Clothes {
    protected Sizes size;
    protected int cost;
    protected String color;
    Clothes(Sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
