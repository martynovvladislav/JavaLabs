package ru.mirea.lab14.task9;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        String text = "English texts for beginners to practice reading and comprehension online and for free. " +
                "Practicing your comprehension of written English will both improve your vocabulary and understanding " +
                "of grammar and word order. The texts below are designed to help you develop while giving you an instant" +
                " evaluation of your progress.";
        
        text = text.replaceAll("[^a-zA-Z]", "");
        
        text = text.toLowerCase();
        
        Map<Character, Integer> letterdict = new HashMap<>();
        
        for (char c : text.toCharArray()) {
            letterdict.put(c, letterdict.getOrDefault(c, 0) + 1);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            int frequency = letterdict.getOrDefault(c, 0);
            System.out.println(c + ": " + frequency);
        }
    }
}
