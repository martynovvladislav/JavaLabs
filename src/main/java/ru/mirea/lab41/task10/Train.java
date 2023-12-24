package ru.mirea.lab41.task10;

public class Train extends  Transport {
    double costperpass;
    double costperkg;

    public Train(double maxweight, int maxpass, double speed, double costperpass, double costperkg) {
        super(maxweight, maxpass, speed);
        this.costperpass = costperpass;
        this.costperkg = costperkg;
    }

    @Override
    public void passengerCost(int passengers, double distance) {
        if(passengers > this.maxpass) System.out.println("Can't use that transport");
        System.out.println("Price for " + passengers + " passengers by train: " + passengers * costperpass * distance);
    }

    @Override
    public void cargoCost(double weight, double distance) {
        if(weight > this.maxweight) System.out.println("Can't use that transport");
        System.out.println("Price for " + weight + " weight by train: " + weight * costperkg * distance);
    }
}
