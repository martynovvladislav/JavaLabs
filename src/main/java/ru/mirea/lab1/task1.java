package ru.mirea.lab1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("AM: " + (float) sum / a.length);
    }
}
