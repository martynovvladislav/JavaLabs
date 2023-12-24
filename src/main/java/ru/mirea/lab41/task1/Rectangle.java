package ru.mirea.lab41.task1;

public class Rectangle extends Shape {
    private double x;
    private double y;
    private double width;
    private double height;
    public Rectangle(double x, double y, double width, double height) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
    @Override
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Coordinates: " + this.x + " " + this.y + " Width: " + this.width + " Height: " + this.height;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
