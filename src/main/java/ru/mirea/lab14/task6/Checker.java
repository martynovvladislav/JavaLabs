package ru.mirea.lab14.task6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public static void main(String[] args) {
        String email = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+(\\.[a-zA-Z]{2,})+$";
        System.out.println("Введите email:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()) {
            System.out.println("Корректный email");
        }
        else System.out.println("Некорректный email");
    }
}
