package ru.mirea.lab2.task9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

        int players = 0 ;
        String[] suits = {
                "Пик", "Бубен", "Черв", "Треф"
        };
        String[] ranks = {
                "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"
        };
        int n = suits.length * ranks.length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of players: ");
        players = sc.nextInt();
        if(5 * players > n){
            System.out.println("Too many players");
            return;
        }


        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = ranks[i] + " " + suits[j];
            }
        }

        //peretasovka
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }


        for (int i = 0; i < players * 5; i++) {
            System.out.println(deck[i]);
            if (i % 5 == 4)
                System.out.println();
        }
    }
}
