package ru.mirea.lab16.BordersTask;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BordersTask extends JFrame {
    public BordersTask() {
        setTitle("BordersTask");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(Color.RED);
        JPanel westPanel = new JPanel(new BorderLayout());
        westPanel.setBackground(Color.BLUE);
        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.setBackground(Color.CYAN);
        JPanel northPanel = new JPanel(new BorderLayout());
        northPanel.setBackground(Color.magenta);
        JPanel eastPanel = new JPanel(new BorderLayout());
        eastPanel.setBackground(Color.YELLOW);

        JLabel centerLabel = new JLabel("ЦАО");
        JLabel westLabel = new JLabel("ЗАО");
        JLabel southLabel = new JLabel("ЮАО");
        JLabel northLabel = new JLabel("САО");
        JLabel eastLabel = new JLabel("ВАО");

        centerPanel.add(centerLabel, BorderLayout.CENTER);
        westPanel.add(westLabel, BorderLayout.CENTER);
        southPanel.add(southLabel, BorderLayout.CENTER);
        northPanel.add(northLabel, BorderLayout.CENTER);
        eastPanel.add(eastLabel, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);
        add(westPanel, BorderLayout.WEST);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);
        add(eastPanel, BorderLayout.EAST);

        centerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(BordersTask.this, "Добро пожаловать в ЦАО");
            }
        });

        westLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(BordersTask.this, "Добро пожаловать в ЗАО");
            }
        });

        southLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(BordersTask.this, "Добро пожаловать в ЮАО");
            }
        });

        northLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(BordersTask.this, "Добро пожаловать в САО");
            }
        });

        eastLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(BordersTask.this, "Добро пожаловать в ВАО");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new BordersTask();
    }
}
