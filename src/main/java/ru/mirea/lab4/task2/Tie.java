package ru.mirea.lab4.task2;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, int cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Одели мужичка");
    }
}
