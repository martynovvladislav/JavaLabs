package ru.mirea.lab2.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of strings:");
        int amount = sc.nextInt();
        String[] arr = new String[amount];
        System.out.println("Enter strings:");
        for(int i = 0; i < amount; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Init list:");
        for(int i = 0; i < amount; i++) {
            System.out.println(arr[i]);
        }

        for(int i = 0; i < amount / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[amount - i - 1];
            arr[amount - i - 1] = temp;
        }

        System.out.println("\nList after operations:");
        for(int i = 0; i < amount; i++) {
            System.out.println(arr[i]);
        }
    }
}
