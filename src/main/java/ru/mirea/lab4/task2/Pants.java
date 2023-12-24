package ru.mirea.lab4.task2;

public class Pants extends Clothes implements MenClothing, WomanClothing{
    public Pants(Sizes size, int cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Одели мужичка");
    }

    @Override
    public void dressWoman() {
        System.out.println("Одели женщину");
    }
}
