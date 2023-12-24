package ru.mirea.lab14.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface Filter {
    boolean apply(Object o);
}

public class task8 {
    public static <T> List<T> filter(T[] array, Filter filter) {
        List<T> filteredList = new ArrayList<>();

        for (T element : array) {
            if (filter.apply(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        String[] passwords = {"F032_Password", "TrySpy12", "smart_pass", "A007"};
        Filter goodPasswords = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof String) {
                    String str = (String) o;
                    Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$");
                    Matcher matcher = pattern.matcher(str);
                    return matcher.matches();
                }
                return false;
            }
        };
        List<String> good_passwords = filter(passwords, goodPasswords);

        for (String str : good_passwords) {
            System.out.println(str);
        }
    }
}
