package ru.mirea.lab10.task1;

public class Student {
    private String firstname;
    private String lastname;
    private String specialization;
    private int course;
    private String group;
    private double gpa;

    public Student(String firstname, String lastname, String specialization, int course, String group, double gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}
