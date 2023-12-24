package ru.mirea.lab3.task2;

public class Tester {
    public int amount;
    public Circle[] circles;

    public Tester(int amount) {
        this.circles = new Circle[amount];
        this.amount = amount;
    }
    public Circle min() {
        Circle minc = this.circles[0];
        for(int i = 0; i < amount; i++) {
            if(minc.getArea() < this.circles[i].getArea()) {
                minc = this.circles[i];
            }
        }
        return minc;
    }

    public Circle max() {
        Circle maxc = this.circles[0];
        for(int i = 0; i < amount; i++) {
            if(maxc.getArea() > this.circles[i].getArea()) {
                maxc = this.circles[i];
            }
        }
        return maxc;
    }

    public void sortCircles() {
        int i, j;
        Circle temp;
        boolean swapped;
        for (i = 0; i < this.amount - 1; i++) {
            swapped = false;
            for (j = 0; j < this.amount - 1 - i; j++) {
                if (this.circles[j].getArea() > this.circles[j + 1].getArea()) {
                    temp = this.circles[j];
                    this.circles[j] = this.circles[j + 1];
                    this.circles[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    public static void main(String[] args) {
        Tester test = new Tester(3);
        test.circles[0] = new Circle(Math.random(), Math.random(), Math.random());
        test.circles[1] = new Circle(Math.random(), Math.random(), Math.random());
        test.circles[2] = new Circle(Math.random(), Math.random(), Math.random());
        System.out.println("The largest circle: " + test.max().getR());
        System.out.println("The smallest circle: " + test.min().getR());
        System.out.println("Initial list:");
        for(int i = 0; i < test.amount; i++) {
            System.out.println(test.circles[i].getR());
        }

        test.sortCircles();
        System.out.println("\nSorted list:");
        for(int i = 0; i < test.amount; i++) {
            System.out.println(test.circles[i].getR());
        }
    }
}
