package ru.mirea.lab9.task1;

import static  ru.mirea.lab9.task1.Student.insertionSort;

public class StudentSortTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Иван"),
                new Student(1, "Владимир"),
                new Student(2, "Кирилл"),
                new Student(4, "Петр")
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nAfter sorting by id:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}