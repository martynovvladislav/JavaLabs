package ru.mirea.lab14.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String text = "(1 + 8) - 9 / 4";


        Pattern pattern = Pattern.compile("\\b\\d+\\b(?!\\s*\\+)");

        Matcher matcher = pattern.matcher(text);

        boolean found = false;

        while (matcher.find()) {
            String number = matcher.group();
            System.out.println("Число без знака '+': " + number);
            found = true;
        }

        if (!found) {
            System.out.println("Цифры без знака '+' не найдены.");
        }
    }
}
