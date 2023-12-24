package ru.mirea.lab41.task9;

public class Sofa extends Furniture {
    private int places;

    public Sofa(String color, int cost, int places) {
        super(color, cost);
        this.places = places;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "places=" + places +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
