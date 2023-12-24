package ru.mirea.lab41.task1;

public class Square extends Shape{
    private double x;
    private double y;
    private double side;

    public Square(double x, double y, double side) {
        this.x = x;
        this.y = y;
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Coordinates: " + this.x + " " + this.y + " Side: " + this.side;
    }

    @Override
    public String getType() {
        return "Square";
    }
}
