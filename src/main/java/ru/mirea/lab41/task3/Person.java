package ru.mirea.lab41.task3;

public class Person {
    private String fullName;
    private int age;

    void move() {
        System.out.println(this.fullName + " идет");
    }

    void talk() {
        System.out.println(this.fullName + " говорит");
    }

    public Person() {

    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ivan", 18);
        System.out.println(person1);
        System.out.println(person2);
    }
}
