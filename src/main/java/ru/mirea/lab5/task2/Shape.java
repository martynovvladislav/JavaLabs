package ru.mirea.lab5.task2;
import java.awt.*;

public abstract class Shape {
    public Color color;
    public double xpos;
    public double ypos;

    public Shape(Color color, double xpos, double ypos) {
        this.color = color;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public abstract void draw(Graphics g);
}
