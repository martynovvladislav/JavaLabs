package ru.mirea.lab6.task6;

public class Magazine implements Printable {
    private String name;
    private String publisher;

    public Magazine(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name=" + name +
                ", publisher=" + publisher +
                '}';
    }

    public static void printMagazines(Printable[] printables) {
        for(Printable printable : printables) {
            if(printable.getClass().equals(Magazine.class)) {
                System.out.println(printable);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
