package ru.mirea.lab41.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(String ...T) {
        for (String s : T) {
            System.out.println(s);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+11111111111", "iPhone 15", 155);
        Phone phone2= new Phone("+12121212121", "Samsung Galaxy 2000", 201);
        Phone phone3 = new Phone("+31311131313", "Nokia 3310", 1000);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();

        phone1.receiveCall("Ivan");
        System.out.println(phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Petya", "+12121212121");
        System.out.println();
        phone3.sendMessage("+12121212121", "+1112222344445", "+13371335");
    }
}
