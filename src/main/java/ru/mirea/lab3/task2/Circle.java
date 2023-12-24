package ru.mirea.lab3.task2;

public class Circle {
    Point point;
    private double r;

    public Circle(double x, double y, double r) {
        this.point = new Point();
        this.setPoint(x, y);
        this.r = r;
    }

    public void setX(double x) {
        this.point.setX(x);
    }

    public void setY(double y) {
        this.point.setY(y);
    }

    public double getX() {
        return this.point.getX();
    }

    public double getY() {
        return this.point.getY();
    }
    public void setPoint(double x, double y) {
        this.point.setX(x);
        this.point.setY(y);
    }

    public double getR() {
        return r;
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

    public void setR(double r) {
        this.r = r;
    }
}
