package ru.mirea.lab2.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the words:");
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') count++;
        }
        System.out.println(count + 1);
    }
}
