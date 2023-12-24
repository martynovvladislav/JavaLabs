package ru.mirea.lab6.task1and2;

public class Tester {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 1, 2, 3);
        MovablePoint point2 = new MovablePoint(5, 5, 2, 3);

        MovableCircle circle = new MovableCircle(5, 1, 1, 2, 3);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);
        System.out.println();

        MovableRectangle rectangle = new MovableRectangle(1, 1, 5, 5, 2, 3);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
