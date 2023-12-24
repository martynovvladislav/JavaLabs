package ru.mirea.lab7.task4;

import java.util.Scanner;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double x, int y) {
        double n = x;
        if(y == 0) return 1;
        for(int i = 1; i < y; i++) {
            x *= n;
        }
        return x;
    }

    @Override
    public double abs(double x) {
        if(x < 0) return -x;
        else return x;
    }

    public static void main(String[] args) {
        MathCalculable mathCalculable = new MathFunc();
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        mathCalculable.abs(r);
        System.out.println(mathCalculable.pow(r, 2) * mathCalculable.PI);
    }
}
