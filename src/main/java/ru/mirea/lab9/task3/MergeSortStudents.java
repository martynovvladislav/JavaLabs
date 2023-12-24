package ru.mirea.lab9.task3;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();


        list1.add(new Student("Иван", 3.8));
        list1.add(new Student("Владислав", 3.5));
        list1.add(new Student("Николай", 4.0));


        list2.add(new Student("Александр", 3.2));
        list2.add(new Student("Егор", 3.9));


        List<Student> mergedList = mergeSort(list1, list2);


        System.out.println("Merged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) > 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}


