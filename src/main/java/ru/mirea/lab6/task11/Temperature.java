package ru.mirea.lab6.task11;

public class Temperature implements Convertable {
    private double temp;

    public Temperature(double temp) {
        this.temp = temp;
    }

    @Override
    public void convert() {
        System.out.println("По Цельсию: " + this.temp + "\nПо Кельвину: " + (this.temp + 237.15) + "\nПо Фаренгейту: " + (this.temp * 1.8 + 32));
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature(15.4);
        temperature.convert();
    }
}
