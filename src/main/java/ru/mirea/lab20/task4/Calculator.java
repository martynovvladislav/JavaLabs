package ru.mirea.lab20.task4;

public class Calculator {
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        int intResult = (int) Calculator.sum(5, 3);
        double doubleResult = Calculator.multiply(2.5, 4.0);

        System.out.println("Sum: " + intResult);
        System.out.println("Multiply: " + doubleResult);

        double divisionResult = Calculator.divide(10, 2.5);
        System.out.println("Division: " + divisionResult);

        double subtractionResult = Calculator.subtract(8.7, 3.2);
        System.out.println("Subtraction: " + subtractionResult);
    }
}

