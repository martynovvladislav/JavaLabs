package ru.mirea.lab21;

import java.util.Arrays;

public class Container<T> {
    private T[] array;

    public Container(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getAt(int index) {
        if (index >= 0 && index < array.length) {
            return (T) array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Container<Integer> intContainer = new Container<>(intArray);
        System.out.println("Integer Array: " + intContainer);

        String[] stringArray = {"apple", "orange", "banana"};
        Container<String> stringContainer = new Container<>(stringArray);
        System.out.println("String Array: " + stringContainer);
        System.out.println(intContainer.getAt(1));
    }
}