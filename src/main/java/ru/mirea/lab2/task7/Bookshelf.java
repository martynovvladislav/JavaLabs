package ru.mirea.lab2.task7;

public class Bookshelf {
    Book[] books;
    int amount;

    public Bookshelf(int amount) {
        this.amount = amount;
        books = new Book[amount];
    }

    public Book firstBook() {
        Book x = this.books[0];
        for(int i = 1; i < this.amount; i++) {
            if(this.books[i].getYear() < x.getYear()) {
                x = this.books[i];
            }
        }
        return x;
    }

    public Book lastBook() {
        Book x = this.books[0];
        for(int i = 1; i < this.amount; i++) {
            if(this.books[i].getYear() > x.getYear()) {
                x = this.books[i];
            }
        }
        return x;
    }

    public void sortBooks() {
        int i, j;
        Book temp;
        boolean swapped;
        for (i = 0; i < amount - 1; i++) {
            swapped = false;
            for (j = 0; j < amount - i - 1; j++) {
                if (this.books[j].getYear() > this.books[j + 1].getYear()) {

                    // Swap arr[j] and arr[j+1]
                    temp = this.books[j];
                    this.books[j] = this.books[j + 1];
                    this.books[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        int amount = 3;
        Bookshelf polka = new Bookshelf(amount);
        polka.books[0] = new Book("Lev Tolstoy", "Voina i mir", 1869);
        polka.books[1] = new Book("Fedor Dostoevsky", "Prestyplenie i nakazanie", 1866);
        polka.books[2] = new Book("Mikhail Bulgakov", "Master i Margarita", 1967);
        System.out.println("First book: " + polka.firstBook().getAuthor() + " " + polka.firstBook().getName());
        System.out.println("Last book: " + polka.lastBook().getAuthor() + " " + polka.lastBook().getName());

        System.out.println("\nUnsorted list");
        for(int i = 0; i < polka.amount; i++) {
            System.out.println(polka.books[i]);
        }
        polka.sortBooks();
        System.out.println("\nSorted list");
        for(int i = 0; i < polka.amount; i++) {
            System.out.println(polka.books[i]);
        }
    }
}
