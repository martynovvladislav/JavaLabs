package ru.mirea.lab8.task16;

import java.util.Scanner;
import java.util.Vector;

public class CountMaxInSeq {

    public static Vector<Integer> max() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0) {
            Vector<Integer> maxes = new Vector<Integer>();
            maxes.add(x);
            return maxes;
        }
        Vector<Integer> y = max();
        if(y.elementAt(0) == x) {
            y.add(x);
        }
        else if(y.elementAt(0) < x) {
            y.clear();
            y.add(x);
        }
        return y;
    }

    public static void main(String[] args) {
        Vector<Integer> ans = max();
        System.out.println(ans.size());
    }
}
