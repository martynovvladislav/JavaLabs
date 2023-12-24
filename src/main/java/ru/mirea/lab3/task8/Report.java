package ru.mirea.lab3.task8;

public class Report {
    public static void generateReport(Employee[] employees) {
        for(int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullname() + ":\n" + String.format("%16.2f", employees[i].getSalary()) + " RUB");
        }
    }
}
