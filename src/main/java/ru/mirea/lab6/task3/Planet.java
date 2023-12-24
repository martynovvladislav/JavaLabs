package ru.mirea.lab6.task3;

public class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Planet mars = new Planet("Mars");
        Planet earth = new Planet("Earth");
        System.out.println(mars.getName());
        System.out.println(earth.getName());
    }
}
