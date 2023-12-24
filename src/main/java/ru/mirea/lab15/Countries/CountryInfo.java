package ru.mirea.lab15.Countries;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryInfo extends JFrame {

    String[] items = {"Russia", "England", "China", "Australia"};
    String[] info = {"Хорошая страна", "Тоже неплохая страна", "Социальный рейтинг повышен", "Там кенгуру есть"};
    CountryInfo() {
        super("CountryInfo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        final JLabel label = new JLabel(" ");
        label.setAlignmentX(LEFT_ALIGNMENT);
        Font font = new Font("Times new roman", Font.BOLD, 20);
        label.setFont(font);
        JComboBox<String> choose = new JComboBox<>(items);
        choose.setPreferredSize(new Dimension(1000, 50));
        choose.setMaximumSize(choose.getPreferredSize());
        content.add(choose);
        content.add(label);
        choose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                int index = box.getSelectedIndex();
                label.setText(info[index]);
            }
        });


        setPreferredSize(new Dimension(500, 300));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new CountryInfo();
    }
}
