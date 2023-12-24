package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.List;

public class Converter {

    public static <T> List<T> convertToList(T[] array) {
        List<T> resultList = new ArrayList<>();

        for (T element : array) {
            resultList.add(element);
        }

        return resultList;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertToList(intArray);
        System.out.println(intList);
        String[] stringArray = {"first", "second", "third"};
        List<String> stringList = convertToList(stringArray);
        System.out.println(stringList);
    }
}
