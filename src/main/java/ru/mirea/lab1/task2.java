package ru.mirea.lab1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int i = 0;
        System.out.println("Enter 10 numbers:");
        do {
            a[i] = sc.nextInt();
            i++;
        } while (i < a.length);

        i = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (i < a.length) {
            if (max < a[i]) max = a[i];
            if (min > a[i]) min = a[i];
            sum += a[i];
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min " + min);
    }
}
