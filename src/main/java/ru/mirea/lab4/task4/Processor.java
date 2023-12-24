package ru.mirea.lab4.task4;

public class Processor {
    private int clockspeed;
    private int bitdepth;
    Processor(int clockspeed, int bitdepth) {
        this.clockspeed = clockspeed;
        this.bitdepth = bitdepth;
    }
    public void overclock() {
        this.clockspeed += 1000;
    }

    public int getBitdepth() {
        return bitdepth;
    }

    public int getClockspeed() {
        return clockspeed;
    }
}
