package ru.mirea.lab2.task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.2, 2.5, 5);
        Circle circle2 = new Circle(3, 1.3, 6);
        System.out.println(circle1.getArea());
        System.out.println(circle2.getLength());
        Circle.compare(circle1, circle2);
    }
}
