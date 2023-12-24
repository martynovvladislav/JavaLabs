package ru.mirea.lab16.GuessGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class GuessGame extends JFrame {
    private final int guessedNum;
    private int attempts;
    private JTextField textField;
    private JPanel centerPanel;

    public GuessGame() {
        setTitle("GuessGame");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        guessedNum = (int) (Math.random() * 21);
        attempts = 3;

        setupUI();
    }

    private void setupUI() {
        JLabel welcomeLabel = new JLabel("GUESS GAME. Введите число:");
        add(welcomeLabel, BorderLayout.NORTH);
        textField = new JTextField(5);
        add(textField);
        JButton guessButton = new JButton("Проверить число");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        add(guessButton, BorderLayout.SOUTH);

    }

    private void checkGuess() {
        int guessMem = 0;
        if (attempts > 0) {
            int userGuess = Integer.parseInt(textField.getText());
            if (userGuess == guessedNum) {
                JOptionPane.showMessageDialog(null, "Вы угадали!", "ПОБЕДА", JOptionPane.INFORMATION_MESSAGE);
                exit(0);
            } else {
                attempts--;
                if (userGuess < guessedNum) {
                    JOptionPane.showMessageDialog(null, "Число больше. Попыток: " + attempts, "ПОПРОБУЙТЕ ЕЩЕ", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Число меньше. Попыток: " + attempts, "ПОПРОБУЙТЕ ЕЩЕ", JOptionPane.INFORMATION_MESSAGE);
                }
                textField.setText("");
            }
            guessMem = userGuess;
        } else {
            if(guessMem == guessedNum) {
                JOptionPane.showMessageDialog(null, "Вы угадали!", "ПОБЕДА", JOptionPane.INFORMATION_MESSAGE);
                exit(0);
            }
            JOptionPane.showMessageDialog(null, "Вы исчерпали все попытки. Загаданное число было: " + guessedNum, "ПОРАЖЕНИЕ", JOptionPane.INFORMATION_MESSAGE);
            textField.setEnabled(false);
            exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuessGame game = new GuessGame();
                game.setVisible(true);
            }
        });
    }
}
