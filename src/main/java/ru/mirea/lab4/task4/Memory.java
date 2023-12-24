package ru.mirea.lab4.task4;

public class Memory {
    private int clockspeed;
    private int volume;
    Memory(int clockspeed, int volume) {
        this.clockspeed = clockspeed;
        this.volume = volume;
    }
    public void overclock() {
        this.clockspeed += 1000;
    }

    public int getClockspeed() {
        return clockspeed;
    }

    public int getVolume() {
        return volume;
    }
}
