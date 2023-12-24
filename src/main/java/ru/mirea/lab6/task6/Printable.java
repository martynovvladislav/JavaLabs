package ru.mirea.lab6.task6;

public interface Printable {
    public void print();

    public static void main(String[] args) {
        Printable[] printables = {new Book("Lev Tolstoy", "Voina i mir"), new Magazine("Komsomolskaya Pravda", "Kremlin")};
        for(Printable p : printables) {
            p.print();
        }
        System.out.println();
        System.out.println("Magazines:");
        Magazine.printMagazines(printables);
        System.out.println();
        System.out.println("Books:");
        Book.printBooks(printables);
    }
}
