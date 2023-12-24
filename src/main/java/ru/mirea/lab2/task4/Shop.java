package ru.mirea.lab2.task4;

import java.util.Scanner;

public class Shop implements ShopInt {
    private String[] computers;

    public Shop() {
        this.computers = new String[0];
    }

    @Override
    public void addPC(String PC) {
        String[] newarr = new String[this.computers.length + 1];
        for(int i = 0; i < this.computers.length; i++) {
            newarr[i] = this.computers[i];
        }
        newarr[this.computers.length] = PC;
        this.computers = newarr;
    }

    @Override
    public boolean deletePC(String PC) {
        if(findPC(PC)) {
            String[] newarr = new String[this.computers.length - 1];
            int j = 0;
            for(int i = 0; i < this.computers.length; i++) {
                if(this.computers[i].equals(PC)) {
                    continue;
                }
                newarr[j++] = this.computers[i];
            }
            this.computers = newarr;
            return true;
        }
        return false;
    }

    @Override
    public boolean findPC(String PC) {
        for(int i = 0; i < this.computers.length; i++) {
            if(this.computers[i].equals(PC)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of pc's:");
        int amount = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < amount; i++) {
            shop.addPC(sc.nextLine());
        }
        System.out.println("\nList of pc's:");
        for(int i = 0; i < amount; i++) {
            System.out.println(shop.computers[i]);
        }

        System.out.println("\nWhat pc do you want to find?");
        if(shop.findPC(sc.nextLine())) {
            System.out.println("Available");
        }
        else {
            System.out.println("Unavailable");
        }

        System.out.println("\nWhat pc do you want to delete?");
        if(shop.deletePC(sc.nextLine())) {
            System.out.println("Success");
            System.out.println("New pc list:");
            for(int i = 0; i < shop.computers.length; i++) {
                System.out.println(shop.computers[i]);
            }
        }
        else {
            System.out.println("This pc is unavailable");
        }
    }
}
