package ru.mirea.lab2.task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author testauthor = new Author("Lev Tolstoy", "leva1828@mirea.ru", 'M');
        System.out.println("Name: " + testauthor.getName());
        System.out.println("Email: " + testauthor.getEmail());
        System.out.println("Enter new email: ");
        Scanner sc = new Scanner(System.in);
        testauthor.setEmail(sc.nextLine());
        System.out.println("Updated Email: " + testauthor.getEmail());
        System.out.println("Gender: " + testauthor.getGender());
        System.out.println("Full information: " + testauthor);
    }
}
