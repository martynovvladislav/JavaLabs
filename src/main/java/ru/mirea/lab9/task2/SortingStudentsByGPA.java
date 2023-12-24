package ru.mirea.lab9.task2;

import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGpa(), student1.getGpa());
    }
}
