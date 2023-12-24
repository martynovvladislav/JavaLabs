package ru.mirea.lab3.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[4];
        Random rand = new Random();
        for(int i = 0; i < 4; i++) {
            a[i] = rand.nextInt(10, 99);
        }
        boolean st = true;
        for(int i = 0; i < 4; i++) {
            System.out.print(a[i] + " ");
        }
        for(int i = 0; i < 3; i++) {
            if(a[i] >= a[i + 1]) st = false;
        }
        if(st) System.out.println("\nStrictly increasing sequence");
        else System.out.println("\nNot strictly increasing sequence");
    }
}
