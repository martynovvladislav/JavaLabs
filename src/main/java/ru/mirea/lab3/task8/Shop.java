package ru.mirea.lab3.task8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    public Map<String, String> list = new HashMap<>();

    public Shop() {
        this.list.put("Candy", "15");
        this.list.put("Tea", "60");
        this.list.put("Cheesecake", "120");
        this.list.put("iPhone", "13000");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        System.out.println("Items in shop:");
        for(Map.Entry<String, String> item : shop.list.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue() + " RUB");
        }
        System.out.println("\nEnter your choice or say STOP:");
        int money = 0;
        String x = sc.nextLine();
        while(!Objects.equals(x, "STOP")) {
            money += Integer.parseInt(shop.list.get(x));
            x = sc.nextLine();
        }
        System.out.println("Choose currency(RUB, USD, EUR):");
        x = sc.nextLine();
        if(x.equals("RUB")) System.out.println("Price: " + money + " RUB");
        else if(x.equals("EUR")) System.out.println("Price: " + Converter.rubtoeur(money) + " EUR");
        else System.out.println("Price: " + Converter.rubtousd(money) + " USD");
    }
}
