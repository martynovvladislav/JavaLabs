package ru.mirea.lab41.task10;

public class Ship extends Transport {
    double costperkg;

    public Ship(double maxweight, double speed, double costperkg) {
        super(maxweight, 0, speed);
        this.costperkg = costperkg;
    }

    @Override
    public void passengerCost(int passengers, double distance) {
        System.out.println("Can't use that transport");
    }

    @Override
    public void cargoCost(double weight, double distance) {
        if(weight > this.maxweight) System.out.println("Can't use that transport");
        System.out.println("Price for " + weight + " weight by ship: " + weight * costperkg * distance);
    }
}
