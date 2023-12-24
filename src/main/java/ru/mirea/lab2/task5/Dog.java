package ru.mirea.lab2.task5;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int convertAge() {
        return this.age * 7;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Age: " + this.age;
    }
}
