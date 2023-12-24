package ru.mirea.lab15.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {
    JTextArea jta1 = new JTextArea(2, 23);
    JButton sum = new JButton("+");
    JButton diff = new JButton("-");
    JButton comp = new JButton("*");
    JButton div = new JButton("/");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    Dimension dim = new Dimension(75, 75);

    double lastnum = 0;
    int lastcommand = 0;

    Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 500);
        add(jta1);
        JButton erase = new JButton("<-");
        erase.setPreferredSize(new Dimension(75, 25));
        erase.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    jta1.setText("");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(erase);
        sum.setPreferredSize(dim);
        add(sum);
        diff.setPreferredSize(dim);
        add(diff);
        comp.setPreferredSize(dim);
        add(comp);
        div.setPreferredSize(dim);
        add(div);
        sum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    lastnum = Double.parseDouble(jta1.getText().trim());
                    lastcommand = 1;
                    jta1.setText("");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        diff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    lastnum = Double.parseDouble(jta1.getText().trim());
                    lastcommand = 2;
                    jta1.setText("");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        comp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    lastnum = Double.parseDouble(jta1.getText().trim());
                    lastcommand = 3;
                    jta1.setText("");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    lastnum = Double.parseDouble(jta1.getText().trim());
                    lastcommand = 4;
                    jta1.setText("");
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        for(int i = 0; i < 10; i++) {
            JButton button = getButton(i);
            button.setPreferredSize(dim);
            add(button);
        }
        JButton dot = new JButton(".");
        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if(!jta1.getText().equals("")) {
                        jta1.setText(jta1.getText() + '.');
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        dot.setPreferredSize(dim);
        add(dot);
        JButton result = new JButton("=");
        result.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if(!jta1.getText().isEmpty() && lastcommand != 0) {
                        double x = lastnum;
                        double y = Double.parseDouble(jta1.getText());
                        switch (lastcommand) {
                            case 1:
                                jta1.setText((x + y) % 1 == 0 ? Integer.toString((int) (x + y)) : Double.toString(x + y));
                                break;
                            case 2:
                                jta1.setText((x - y) % 1 == 0 ? Integer.toString((int) (x - y)) : Double.toString(x - y));
                                break;
                            case 3:
                                jta1.setText((x * y) % 1 == 0 ? Integer.toString((int) (x * y)) : Double.toString(x * y));
                                break;
                            case 4:
                                jta1.setText((x / y) % 1 == 0 ? Integer.toString((int) (x / y)) : Double.toString(x / y));
                                break;
                        }
                        lastcommand = 0;
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        result.setPreferredSize(dim);
        add(result);
        setVisible(true);
    }

    private JButton getButton(int i) {
        JButton button = new JButton(Integer.toString(i));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if(!(i == 0 && jta1.getText().isEmpty())) {
                        jta1.setText(jta1.getText() + i);
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        return button;
    }

    public static void main(String[]args){
        new Calculator();
    }
}