package ru.mirea.lab5.task1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class task1 {
    public static int milan = 0;
    public static int madrid = 0;

    public static void main(String args[]) {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize( new Dimension(250,300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);
        JLabel labresult = new JLabel("Result 0 X 0", JLabel.CENTER);
        JLabel lablast = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel labwinner = new JLabel("Winner: DRAW", JLabel.CENTER);
        panel.add(labresult);
        panel.add(lablast);
        panel.add(labwinner);
        frame.getContentPane().add(panel);
        button1.addActionListener(new ActionListener() {
            // Используем переопределение
            @Override
            // Добавляем событие нажатия на кнопку e — название события
            public void actionPerformed(ActionEvent e) {
                milan++;
                labresult.setText("Result " + milan + " X " + madrid);
                lablast.setText("Last Scorer: AC Milan");
                if(milan > madrid) labwinner.setText("Winner: AC Milan");
                else if(milan < madrid) labwinner.setText("Winner: Real Madrid");
                else labwinner.setText("Winner: DRAW");
            }
        });
        button2.addActionListener(new ActionListener() {
            // Используем переопределение
            @Override
            // Добавляем событие нажатия на кнопку e — название события
            public void actionPerformed(ActionEvent e) {
                madrid++;
                labresult.setText("Result " + milan + " X " + madrid);
                lablast.setText("Last Scorer: Real Madrid");
                if(milan > madrid) labwinner.setText("Winner: AC Milan");
                else if(milan < madrid) labwinner.setText("Winner: Real Madrid");
                else labwinner.setText("Winner: DRAW");
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}

