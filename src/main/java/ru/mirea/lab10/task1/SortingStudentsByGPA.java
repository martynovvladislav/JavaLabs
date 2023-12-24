package ru.mirea.lab10.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class SortingStudentsByGPA {
    private List<Student> iDNumber = new ArrayList<>();

    public void setArray(List<Student> students) {
        iDNumber = students;
    }

    public void quicksort() {
        iDNumber.sort(Comparator.comparing(Student::getGpa).reversed());
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println("Имя: " + student.getFirstname() + ", Фамилия: " + student.getLastname() + ", Курс: " + student.getCourse() + ", Средний балл: " + student.getGpa());
        }
    }

    public void sortByField(Comparator<Student> comparator) {
        iDNumber.sort(comparator);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "IVT", 1, "IKBO-22-23", 3.5));
        students2.add(new Student("Петр", "Петров", "IVT", 2, "IKBO-22-22", 4.5));
        students.add(new Student("Владислав", "Мартынов", "PI", 2, "IKBO-16-22", 5.0));

        List<Student> studentsall = new ArrayList<>();
        studentsall.addAll(students);
        studentsall.addAll(students2);
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(studentsall);

        System.out.println("Sorting by gpa:");
        sorter.quicksort();
        sorter.outArray();

        System.out.println("\nSorting by course number:");
        sorter.sortByField(Comparator.comparing(Student::getCourse));
        sorter.outArray();
    }
}