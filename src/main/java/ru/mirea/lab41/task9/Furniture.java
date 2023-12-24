package ru.mirea.lab41.task9;

abstract class Furniture {
    protected String color;
    protected int cost;

    public Furniture() {}

    public Furniture(String color, int cost) {
        this.color = color;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

}
