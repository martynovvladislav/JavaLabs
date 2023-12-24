package ru.mirea.lab41.task4;

import java.util.Random;

public class Matrix {
    private double[][] arr;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.cols = cols;
        this.rows = rows;
        this.arr = new double[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                Random rand = new Random();
                arr[i][j] = rand.nextDouble(1, 100);
            }
        }
    }

    public void printMatrix() {
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.cols; j++) {
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void sumMatrix(Matrix matrix2) {
        if(this.rows != matrix2.rows || this.cols != matrix2.cols) {
            System.out.println("Can't sum");
            return;
        }
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.cols; j++) {
                this.arr[i][j] += matrix2.arr[i][j];
            }
        }
    }

    public void numberMult(double n) {
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.cols; j++) {
                this.arr[i][j] *= n;
            }
        }
    }

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        System.out.println("First matrix:");
        matrix.printMatrix();
        matrix.numberMult(5);
        System.out.println("First matrix (*5):");
        matrix.printMatrix();
        Matrix matrix2 = new Matrix(3, 4);
        System.out.println("Second matrix:");
        matrix2.printMatrix();
        matrix.sumMatrix(matrix2);
        System.out.println("First matrix + second matrix:");
        matrix.printMatrix();
    }
}
