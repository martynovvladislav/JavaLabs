package ru.mirea.lab1;

import java.util.Scanner;

public class task5 {
    public static int fact(int n) {
        if (n == 0) return 1;
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Factorial: " + fact(n));
    }
}
