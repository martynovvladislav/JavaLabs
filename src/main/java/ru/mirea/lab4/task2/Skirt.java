package ru.mirea.lab4.task2;

public class Skirt extends Clothes implements WomanClothing {
    public Skirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressWoman() {
        System.out.println("Одели женщину");
    }
}
