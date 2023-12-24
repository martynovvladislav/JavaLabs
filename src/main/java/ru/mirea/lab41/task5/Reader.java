package ru.mirea.lab41.task5;

public class Reader {
    private String name;
    private int number;
    private String faculty;
    private String birthdate;
    private String phone;

    public Reader(String name, int number, String faculty, String birthdate, String phone) {
        this.name = name;
        this.number = number;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.phone = phone;
    }

    public void takeBook(int n) {
        System.out.println(this.name + " взял " + n + " книги");
    }

    public void takeBook(String...T) {
        System.out.print(this.name + " взял книги: ");
        for(int i = 0; i < T.length; i++) {
            System.out.print(T[i] + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book...T) {
        System.out.print(this.name + " взял книги: ");
        for(int i = 0; i < T.length; i++) {
            System.out.print(T[i].getName() + ", ");
        }
        System.out.println();
    }

    public void returnBook(int n) {
        System.out.println(this.name + " вернул " + n + " книги");
    }

    public void returnBook(String...T) {
        System.out.print(this.name + " вернул книги: ");
        for(int i = 0; i < T.length; i++) {
            System.out.print(T[i] + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book...T) {
        System.out.print(this.name + " вернул книги: ");
        for(int i = 0; i < T.length; i++) {
            System.out.print(T[i].getName() + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("First book", "First Author");
        Book book2 = new Book("Second book", "Second Author");
        Reader reader = new Reader("Ivan", 100, "IIT", "03.12.2003", "+79876453615");
        reader.takeBook(3);
        reader.returnBook(3);
        System.out.println();
        reader.takeBook("Book", "Book2");
        reader.returnBook("Book", "Book2");
        System.out.println();
        reader.takeBook(book1, book2);
        reader.returnBook(book1, book2);
    }
}
