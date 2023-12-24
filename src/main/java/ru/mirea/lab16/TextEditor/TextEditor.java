package ru.mirea.lab16.TextEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private final JTextArea textArea;

    public TextEditor() {
        setTitle("TextEditor");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        add(textArea, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();

        JMenu colorMenu = getColorMenu();

        JMenu fontMenu = new JMenu("Шрифт");
        JMenuItem tnrItem = new JMenuItem("Times New Roman");
        JMenuItem mssItem = new JMenuItem("MS Sans Serif");
        JMenuItem cnItem = new JMenuItem("Courier New");

        tnrItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            }
        });

        mssItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
            }
        });

        cnItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });

        fontMenu.add(tnrItem);
        fontMenu.add(mssItem);
        fontMenu.add(cnItem);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);
        setVisible(true);
    }

    private JMenu getColorMenu() {
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueItem = new JMenuItem("Синий");
        JMenuItem redItem = new JMenuItem("Красный");
        JMenuItem blackItem = new JMenuItem("Черный");

        blueItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        });
        redItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        });
        blackItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLACK);
            }
        });

        colorMenu.add(blueItem);
        colorMenu.add(redItem);
        colorMenu.add(blackItem);
        return colorMenu;
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}
