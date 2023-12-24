package ru.mirea.lab41.task7;

public class Learner {
    protected String firstName;
    protected String secondName;

    public Learner(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public static void main(String[] args) {
        Learner student = new Student("Ivan", "Ivanov");
        Learner schoolnik = new Schoolchild("Andrey", "Andreev");
        Learner[] learners = {student, schoolnik};
        System.out.println("Students:");
        for(int i = 0; i < learners.length; i++) {
            if(learners[i].getClass().equals(Student.class)) {
                System.out.println(learners[i].firstName + " " + learners[i].secondName);
            }
        }
        System.out.println("\n" + "Schoolchilds:");
        for(int i = 0; i < learners.length; i++) {
            if(learners[i].getClass().equals(Schoolchild.class)) {
                System.out.println(learners[i].firstName + " " + learners[i].secondName);
            }
        }
    }
}
