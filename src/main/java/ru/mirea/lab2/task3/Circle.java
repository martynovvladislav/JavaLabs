package ru.mirea.lab2.task3;

public class Circle {
    Point point;
    private double r;

    private String colour;
    public Circle(double x, double y, double r, String colour) {
        this.point = new Point();
        this.setPoint(x, y);
        this.r = r;
        this.colour = colour;
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

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
