package ru.mirea.lab14.task7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public static void main(String[] args) {
        String password = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Z|a-z|\\d|_]{8,}$";
        System.out.println("Введите пароль:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) {
            System.out.println("Корректный пароль");
        }
        else System.out.println("Некорректный пароль");
    }
}
