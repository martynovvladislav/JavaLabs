package ru.mirea.lab18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Выполнится в любом случае");
        }
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}