package ru.mirea.lab4.task4;

public class Monitor {
    private int diagonal;
    private int frequency;
    private boolean on = false;

    Monitor(int diagonal, int frequency) {
        this.diagonal = diagonal;
        this.frequency = frequency;
    }

    public void turnOn() {
        if(!on) System.out.println("Screen on!");
    }
    public void turnOff() {
        if(on) System.out.println("Screen off!");
    }
}
