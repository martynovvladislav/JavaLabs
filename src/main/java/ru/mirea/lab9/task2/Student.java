package ru.mirea.lab9.task2;

import java.util.Arrays;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", 3.8),
                new Student("Кирилл", 3.5),
                new Student("Петр", 4.0),
                new Student("Арсений", 3.2)
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }


        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
