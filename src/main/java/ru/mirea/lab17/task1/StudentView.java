package ru.mirea.lab17.task1;

import javax.swing.*;

public class StudentView extends JFrame {

    static JFrame frame;
    static JLabel label = new JLabel();
    public StudentView() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.add(label);
        frame.add(p);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public void printStudentDetails(String StudentName, String StudentRollNo) {
        String outputData = "<html>Student information:<br/>" + "Name: " + StudentName
                + "<br/>" + "RollNo: " + StudentRollNo + "</html>";
        label.setText(outputData);
    }
}
