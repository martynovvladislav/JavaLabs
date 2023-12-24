package ru.mirea.lab41.task1;

public class Circle extends Shape {
    private double x;
    private double y;
    private double r;
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Coordinates: " + this.x + ", " + this.y + " Radius: " + r;
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
