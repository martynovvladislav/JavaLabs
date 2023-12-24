package ru.mirea.lab5.task2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Square extends Shape {
    public double sideLength;

    public Square(Color color, double xpos, double ypos, double sideLength) {
        super(color, xpos, ypos);
        this.sideLength = sideLength;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D.Double square = new Rectangle2D.Double(xpos, ypos, sideLength, sideLength);
        g2d.setColor(color);
        g2d.fill(square);
    }
}
