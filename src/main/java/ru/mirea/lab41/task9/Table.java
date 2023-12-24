package ru.mirea.lab41.task9;

public class Table extends Furniture {
    private String type;

    public Table(String color, int cost, String type) {
        super(color, cost);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Table{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
