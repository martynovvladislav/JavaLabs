package ru.mirea.lab5.task2;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class Circle extends Shape {
    public double radius;

    public Circle(Color color, double xpos, double ypos, double radius) {
        super(color, xpos, ypos);
        this.radius = radius;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(xpos, ypos, radius*2, radius*2);
        g2d.setColor(color);
        g2d.fill(circle);
    }
}
