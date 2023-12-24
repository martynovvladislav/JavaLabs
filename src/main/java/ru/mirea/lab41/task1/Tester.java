package ru.mirea.lab41.task1;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(1.1, 2.2, 3.3);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter:" + circle.getPerimeter());
        System.out.println(circle.getType());
        System.out.println(circle);
    }
}
