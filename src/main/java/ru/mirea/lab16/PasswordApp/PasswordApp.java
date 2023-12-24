package ru.mirea.lab16.PasswordApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PasswordApp extends JFrame {

    ArrayList<User> users = new ArrayList<User>(2);
    JLabel userNameLabel = new JLabel("User name:");
    JPasswordField passwordField = new JPasswordField(20);
    public PasswordApp() {
        users.add(new User("admin", "admin"));
        users.add(new User("guest", "guest"));
        setTitle("Проверка пароля");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceField = new JTextField(20);
        serviceField.setText("test");
        JTextField userField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");


        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(serviceLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(serviceField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(userNameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(userField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(passwordField, constraints);

        JButton checkButton = getCheckButton(userField);

        constraints.gridwidth = 2;
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(checkButton, constraints);

        add(panel);
        setVisible(true);
    }

    private JButton getCheckButton(JTextField userField) {
        JButton checkButton = new JButton("Проверить пароль");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(User user : users) {
                    if(userField.getText().equals(user.username) && passwordField.getText().equals(user.password)) {
                        JOptionPane.showMessageDialog(null, "Welcome, " + user.username + "!", "Logged in!", JOptionPane.INFORMATION_MESSAGE);
                        userField.setText(null);
                        passwordField.setText(null);
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Wrong username or password!", "Incorrect data!", JOptionPane.ERROR_MESSAGE);
                userField.setText(null);
                passwordField.setText(null);
            }
        });
        return checkButton;
    }

    public static void main(String[] args) {
        new PasswordApp();
    }
}

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
