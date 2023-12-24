package ru.mirea.lab12.task4;

import java.util.StringTokenizer;

public class Shirt {
    private String id;
    private String itemName;
    private String color;
    private String size;

    public Shirt(String id, String itemName, String color, String size) {
        this.id = id;
        this.itemName = itemName;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{\n" +
                "id='" + id + "'\n" +
                "itemName='" + itemName + "'\n" +
                "color='" + color + "'\n" +
                "size='" + size + "'\n" +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirtsS = new Shirt[11];
        for(int i = 0; i < 11; i++) {
            StringTokenizer st = new StringTokenizer(shirts[i], ",");
            Shirt shirt = new Shirt(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
            shirtsS[i] = shirt;
        }

        for(Shirt shirt : shirtsS) System.out.println(shirt);
    }
}
