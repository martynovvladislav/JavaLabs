package ru.mirea.lab3.task1;
import java.util.Random;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] a = new double[10];
        for(int i = 0; i < 5; i++) {
            a[i] = rand.nextDouble(1000);
        }
        for(int i = 5; i < 10; i++) {
            a[i] = Math.random();
        }

        System.out.println("Initial array:");
        for(int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }

        int i, j;
        double temp;
        boolean swapped;
        for (i = 0; i < 9; i++) {
            swapped = false;
            for (j = 0; j < 9 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

        System.out.println("\nNew array:");
        for(i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
