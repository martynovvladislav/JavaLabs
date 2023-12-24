package ru.mirea.lab41.task9;

public class FurnitureShop {
    Furniture arr[];

    public FurnitureShop(int n) {
        this.arr = new Furniture[n];
    }

    public static void main(String[] args) {
        FurnitureShop furnitureShop = new FurnitureShop(2);
        Sofa sofa = new Sofa("Black", 10000, 2);
        Table table = new Table("White", 9000, "Kitchen");
        furnitureShop.arr[0] = sofa;
        furnitureShop.arr[1] = table;
        for(Furniture furniture : furnitureShop.arr) {
            System.out.println(furniture);
        }
    }
}
