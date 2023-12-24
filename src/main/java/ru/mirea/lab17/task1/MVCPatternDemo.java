package ru.mirea.lab17.task1;

public class MVCPatternDemo {
    public static void main(String[] args) throws InterruptedException {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        Thread.sleep(5000);
        controller.setStudentName("Kirill");
        controller.setStudentRollNo("156");
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Ivan");
        student.setRollNo("13");
        return student;
    }
}
