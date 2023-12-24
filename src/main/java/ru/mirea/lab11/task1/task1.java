package ru.mirea.lab11.task1;

import java.util.Date;

public class task1 {
    public static void main(String[] args) {
        String lastname = "Иванов";

        Date firstDate = new Date();

        Date secondDate = new Date();

        System.out.println("Фамилия разработчика: " + lastname);
        System.out.println("Дата и время получения задания: " + firstDate);
        System.out.println("Текущая дата и время: " + secondDate);
    }
}
