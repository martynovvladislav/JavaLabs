package ru.mirea.lab8.task17;

import java.util.Scanner;

public class MaxSeq {

    public static int max() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0) return x;
        int y = max();
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
