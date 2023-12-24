package ru.mirea.lab12.task5;

public class Phone {
    public static String numberConvert(String num) {
        if(num.startsWith("+")) {
            return num.substring(0, num.length() - 10) + num.substring(num.length() - 10, num.length() - 7) + "-" + num.substring(num.length() - 7, num.length() - 4) + "-" + num.substring(num.length() - 4, num.length());
        }
        else {
            return "+7" + num.substring(1, num.length() - 10) + num.substring(num.length() - 10, num.length() - 7) + "-" + num.substring(num.length() - 7, num.length() - 4) + "-" + num.substring(num.length() - 4, num.length());
        }
    }

    public static void main(String[] args) {
        String num = "+104289652211";
        System.out.println(numberConvert(num));
        num = "+79225457118";
        System.out.println(numberConvert(num));
    }
}
