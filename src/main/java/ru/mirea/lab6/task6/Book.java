package ru.mirea.lab6.task6;

public class Book implements Printable {
    private String author;
    private String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name=" + name +
                '}';
    }

    public static void printBooks(Printable[] printables) {
        for(Printable printable : printables) {
            if(printable.getClass().equals(Book.class)) {
                System.out.println(printable);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
