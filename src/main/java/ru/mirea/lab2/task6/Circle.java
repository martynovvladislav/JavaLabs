package ru.mirea.lab2.task6;

public class Circle {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    public static void compare(Circle circle1, Circle circle2) {
        if(circle1.getArea() > circle2.getArea()) {
            System.out.println("First circle is bigger");
        }
        else {
            System.out.println("Second circle is bigger");
        }
    }
}
