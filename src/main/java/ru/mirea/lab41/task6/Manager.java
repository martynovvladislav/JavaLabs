package ru.mirea.lab41.task6;

public class Manager extends Employer {
    private double averageSum;
    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return this.income + this.averageSum;
    }
}
