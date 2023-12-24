package ru.mirea.lab8.task14;

public class Digits {
    public static void recursionleft(int x) {
        if(x > 0) {
            recursionleft(x / 10);
            System.out.print(x % 10 + " ");
        }
    }

    public static void recursionright(int x) {
        if(x > 0) {
            System.out.print(x % 10 + " ");
            recursionright(x / 10);
        }
    }

    public static void main(String[] args) {
        int x = 123450;
        Digits.recursionleft(x);
        System.out.println();
        Digits.recursionright(x);
    }
}
