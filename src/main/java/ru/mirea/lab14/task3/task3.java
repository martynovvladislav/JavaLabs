package ru.mirea.lab14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String data = "25.98 USD, 100 RUB, 1 EUR,   44 ERR, 0.004 EU";

        Pattern pattern = Pattern.compile("\\b(\\d+(?:\\.\\d{1,2})?)\\s+(USD|RUB|EUR)\\b");

        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(2);

            System.out.println("Цена: " + price + " " + currency);
        }
    }
}
