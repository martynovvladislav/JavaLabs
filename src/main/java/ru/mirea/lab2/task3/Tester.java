package ru.mirea.lab2.task3;

public class Tester {
    int amount;
    Circle[] arr;

    public Tester(int amount) {
        this.amount = amount;
        this.arr = new Circle[amount];
    }

    public static void main(String[] args) {
        Tester test = new Tester(2);
        test.arr[0] = new Circle(1.2, 1.3, 5, "Red");
        test.arr[1] = new Circle(5, 5.4, 3, "Green");
        System.out.println("Amount of circles: " + test.amount + '\n');
        System.out.println("First circle");
        System.out.println("X Point: " + test.arr[0].getX());
        System.out.println("Y Point: " + test.arr[0].getY());
        System.out.println("Radius: " + test.arr[0].getR());
        System.out.println("Colour: " + test.arr[0].getColour());
        System.out.println('\n' + "Second circle");
        System.out.println("X Point: " + test.arr[1].getX());
        System.out.println("Y Point: " + test.arr[1].getY());
        System.out.println("Radius: " + test.arr[1].getR());
        System.out.println("Colour: " + test.arr[1].getColour());
    }
}
