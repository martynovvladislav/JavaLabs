package ru.mirea.lab14.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Строка такая же");
        } else {
            System.out.println("Строка другая");
        }
    }
}
