package ru.mirea.lab2.task5;

public class Tester {
    Dog[] dogs;

    public Tester() {
        this.dogs = new Dog[0];
    }

    public void addDog(Dog dog) {
        Dog[] newarr = new Dog[this.dogs.length + 1];
        for(int i = 0; i < this.dogs.length; i++) {
            newarr[i] = this.dogs[i];
        }
        newarr[this.dogs.length] = dog;
        this.dogs = newarr;
    }

    public static void main(String[] args) {
        Tester pitomnik = new Tester();
        Dog dog1 = new Dog("Ivan", 2);
        Dog dog2 = new Dog("Masha", 5);
        pitomnik.addDog(dog1);
        pitomnik.addDog(dog2);
        System.out.println("\nList of dogs:");
        for(int i = 0; i < pitomnik.dogs.length; i++) {
            System.out.println(pitomnik.dogs[i]);
        }
    }
}
