package ru.mirea.lab11.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        final long n = 100000000;

        long startTime = System.currentTimeMillis();
        List<Long> arrayList = new ArrayList<>();
        for (long i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время заполнения ArrayList: " + (endTime - startTime) + " миллисекунд");

        startTime = System.currentTimeMillis();
        List<Long> linkedList = new LinkedList<>();
        for (long i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время заполнения LinkedList: " + (endTime - startTime) + " миллисекунд");


        startTime = System.currentTimeMillis();
        arrayList.add((int)n / 2, (long)-1);
        endTime = System.currentTimeMillis();
        System.out.println("Время вставки в середину ArrayList: " + (endTime - startTime) + " миллисекунд");

        // Измеряем время вставки элемента в середину LinkedList
        startTime = System.currentTimeMillis();
        linkedList.add((int)n / 2, (long)-1);
        endTime = System.currentTimeMillis();
        System.out.println("Время вставки в середину LinkedList: " + (endTime - startTime) + " миллисекунд");

        // Измеряем время удаления элемента из середины ArrayList
        startTime = System.currentTimeMillis();
        arrayList.remove(n / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из середины ArrayList: " + (endTime - startTime) + " миллисекунд");

        startTime = System.currentTimeMillis();
        linkedList.remove(n / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Время удаления из середины LinkedList: " + (endTime - startTime) + " миллисекунд");

        startTime = System.currentTimeMillis();
        boolean foundInArrayList = arrayList.contains(n / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Поиск в ArrayList: " + (endTime - startTime) + " миллисекунд");

        // Измеряем время поиска элемента в LinkedList
        startTime = System.currentTimeMillis();
        boolean foundInLinkedList = linkedList.contains(n / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Поиск в LinkedList: " + (endTime - startTime) + " миллисекунд");

    }
}
