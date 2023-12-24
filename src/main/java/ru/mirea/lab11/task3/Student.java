package ru.mirea.lab11.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String firstname;
    private String secondname;
    private Date birthday;
    private String group;

    public Student(String firstname, String secondname, Date birthday, String group) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.birthday = birthday;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getGroup() {
        return group;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    // Метод для форматирования даты рождения
    public String formatebirthday(String формат) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(формат);
        return dateFormat.format(birthday);
    }

    @Override
    public String toString() {
        return "Имя: " + firstname + ", Фамилия: " + secondname + ", Дата рождения: " + formatebirthday("dd.MM.yyyy");
    }

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Date date = dateFormat.parse("15.05.2003");
            Student student = new Student("Иван", "Иванов", date, "IKBO-16-22");

            System.out.println("Информация о студенте:");
            System.out.println(student);

            System.out.println("Дата рождения (полный формат): " + student.formatebirthday("dd MMMM yyyy"));
            System.out.println("Дата рождения (короткий формат): " + student.formatebirthday("dd.MM.yy"));
        } catch (ParseException e) {
            System.out.println("Ошибка в формате даты.");
        }
    }
}

