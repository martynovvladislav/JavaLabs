package ru.mirea.lab3.task6;

import jdk.dynalink.beans.StaticClass;

import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        Double n = Double.valueOf(3.14);
        System.out.println(n);
        String s = "122.3";
        n = Double.parseDouble(s);
        System.out.println(n);
        byte a = n.byteValue();
        float b = n.floatValue();
        int c = n.intValue();
        long d = n.longValue();
        short e = n.shortValue();
        String D = Double.toString(3.14);
    }
}
