package ru.mirea.lab14.task1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\s+");
        String[] elements = pattern.split(input);
        System.out.println("Разделенная строка:");
        for (String element : elements) {
            System.out.println(element);
        }
    }
}
