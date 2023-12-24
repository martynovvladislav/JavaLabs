package ru.mirea.lab3.task4n5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(n <= 0) {
            System.out.println("Enter the amount of numbers:");
            if(sc.hasNextInt()) n = sc.nextInt();
            else {
                sc.nextLine();
            }
        }
        int[] a = new int[n];
        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            a[i] = rand.nextInt(0, n);
        }
        System.out.println("\nInitial array:");
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        int[] anew = new int[100];
        int j = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) {
                anew[j++] = a[i];
            }
        }

        if(j == 0) System.out.println("No even numbers");
        else {
            System.out.println("\nArray with even numbers:");
            for(int i = 0; i < j; i++) {
                System.out.println(anew[i]);
            }
        }
    }
}
