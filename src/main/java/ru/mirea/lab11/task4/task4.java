package ru.mirea.lab11.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год (YYYY): ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (MM): ");
        int month = scanner.nextInt();
        System.out.print("Введите день месяца (dd): ");
        int day = scanner.nextInt();

        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);

        Date date = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("Date object: " + dateFormat.format(date));

        SimpleDateFormat calendarFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("Calendar object: " + calendarFormat.format(calendar.getTime()));
    }
}
