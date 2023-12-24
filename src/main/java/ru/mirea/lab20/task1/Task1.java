package ru.mirea.lab20.task1;

import java.io.Serializable;

public class Task1<T extends Comparable<T>, V extends Task1.Animal & Serializable, K> {
    private T tValue;
    private V vValue;
    private K kValue;

    public Task1(T t, V v, K k) {
        this.tValue = t;
        this.vValue = v;
        this.kValue = k;
    }

    public void printClassNames() {
        System.out.println(tValue.getClass().getName()
        + " " + vValue.getClass().getName()
        + " " + kValue.getClass().getName());
    }

    public class Animal {

    }
}
