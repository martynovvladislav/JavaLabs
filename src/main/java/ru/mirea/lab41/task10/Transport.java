package ru.mirea.lab41.task10;

public abstract class Transport {
    protected double maxweight;
    protected int maxpass;
    protected double speed;

    public Transport(double maxweight, int maxpass, double speed) {
        this.maxweight = maxweight;
        this.maxpass = maxpass;
        this.speed = speed;
    }

    public abstract void passengerCost(int passengers, double distance);

    public abstract void cargoCost(double weight, double distance);

    public void time(double distance) {
        System.out.println("Time is: " + (distance / speed));
    }
}
