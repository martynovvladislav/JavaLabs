package ru.mirea.lab3.task8;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullname() {
        return fullname;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Martynov Vladislav", 100000000.2345);
        employees[1] = new Employee("Ivanov Ivan", 2000.32313);
        employees[2] = new Employee("Kirillov Kirill", 1234.43424);
        Report.generateReport(employees);

    }
}
