package ru.mirea.lab24.task1;

public class Complex {
    private int real;
    private int image;

    Complex() {
        this.image = 0;
        this.real = 0;
    }

    Complex(int real, int image) {
        this.image = image;
        this.real = real;
    }
}
