package ru.mirea.lab1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            String s = String.format("%.2f", 1.0 / i);
            System.out.println(String.format("%d number: ", i) + s);
        }
    }
}
