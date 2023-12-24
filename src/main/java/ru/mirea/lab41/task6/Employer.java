package ru.mirea.lab41.task6;

public class Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return this.income;
    }

    public static void main(String[] args) {
        Employer employer = new Manager("Ivan", "Ivanov", 1500, 1000);
        Employer employer1 = new Employer("Kirill", "Kirillov", 1200);
        Employer[] employers = {employer, employer1};
        for(int i = 0; i < employers.length; i++) {
            System.out.println("Income of the employer " + employers[i].firstName + ": " + employers[i].getIncome());
        }
    }
}
