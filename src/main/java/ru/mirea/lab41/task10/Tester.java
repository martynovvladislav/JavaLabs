package ru.mirea.lab41.task10;

public class Tester {
    public static void main(String[] args) {
        Transport automobile = new Automobile(350, 5, 60, 100, 1);
        Transport airplane = new Airplane(1000, 1000, 10);
        Transport train = new Train(1000, 500, 90, 200, 5);
        Transport ship = new Ship(2000, 80, 20);
        Transport[] transports = {automobile, airplane, train, ship};
        for(Transport transport : transports) {
            System.out.println(transport.getClass().getSimpleName());
            transport.passengerCost(5, 1000);
            transport.cargoCost(1000, 1000);
            transport.time(1000);
            System.out.println();
        }
    }
}
