package ru.mirea.lab12.task2;

public class Person {
    private String firstName;
    private String lastName;
    private String midName;

    public Person(String firstName, String lastName, String midName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midName;
    }

    public String personFio() {
        if(this.firstName != null) {
            if(this.midName != null) {
                return this.lastName + " " + this.firstName.charAt(0) + "." + this.midName.charAt(0) + ".";
            }
            return this.lastName + " " + this.firstName;
        }
        else if(this.midName != null){
            return this.lastName + " " + this.midName;
        }
        else {
            return this.lastName;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Ivan", "Ivanov", "Ivanovich");
        System.out.println(person.personFio());
    }
}
