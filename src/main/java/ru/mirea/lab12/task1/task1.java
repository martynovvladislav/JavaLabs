package ru.mirea.lab12.task1;

import java.util.Scanner;

public class task1 {

    public static void strChange(String s) {
        System.out.println(s.charAt(s.length() - 1));
        System.out.println("Ends with '!!!': " + s.endsWith("!!!"));
        System.out.println("Starts with 'I like': " + s.startsWith("I like"));
        System.out.println("Contains 'Java': " + s.contains("Java"));
        System.out.println("Position of 'Java': " + s.indexOf("Java"));
        System.out.println("Replaced chars: " + s.replace('a', 'o'));
        System.out.println("Upper case:" + s.toUpperCase());
        System.out.println("Lower case: " + s.toLowerCase());
        System.out.println("'Java' substring: " + s.substring(s.indexOf("Java"), s.indexOf("Java") + "Java".length()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        strChange(s);
    }
}
