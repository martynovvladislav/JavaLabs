package ru.mirea.lab11.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String temp = dateFormat.format(new Date());
        Date currentDate = dateFormat.parse(temp);

        // Ввод даты пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (yyyy-MM-dd):\n");
        String userInput = scanner.nextLine();

        try {
            Date userDate = dateFormat.parse(userInput);

            int comparisonResult = currentDate.compareTo(userDate);

            if (comparisonResult > 0) {
                System.out.println("Введенная дата и время раньше текущей.");
            } else if (comparisonResult < 0) {
                System.out.println("Введенная дата и время позже текущей.");
            } else {
                System.out.println("Введенная дата и время совпадают с текущей.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка в формате введенной даты и времени. Используйте формат yyyy-MM-dd");
        }
    }
}
