package ru.mirea.lab5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawingPanel extends JPanel {
    private ArrayList<Shape> shapes;

    public DrawingPanel() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        repaint(); // Перерисовываем панель при добавлении новой фигуры
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Рисование фигур");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);
        for(int i = 0; i < 10; i++) {
            drawingPanel.addShape(new Circle(Color.RED, i*20, 0, 10));
        }
        for(int i = 2; i < 12; i++) {
            drawingPanel.addShape(new Square(Color.BLUE, 0, i*20, 10));
        }


        frame.setVisible(true);
    }
}