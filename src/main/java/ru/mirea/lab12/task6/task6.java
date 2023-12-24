package ru.mirea.lab12.task6;

import java.io.*;
import java.util.*;

public class task6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        scanner.close();

        List<String> words = readWordsFromFile(fileName);

        for(String word : words) System.out.println(word);

        String orderedLine = getOrderedLine(words);

        System.out.println(orderedLine);
    }

    public static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] wordArray = line.split(" ");
            words.addAll(Arrays.asList(wordArray));
        }
        reader.close();
        return words;
    }

    public static String getOrderedLine(List<String> words) {
        if (words.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(words.get(0) + " ");
        words.remove(words.get(0));
        while(!words.isEmpty()) {
            String resstr = result.toString();
            for(String word : words) {
                if(resstr.charAt(resstr.length() - 2) == word.charAt(0)) {
                    result.append(word + " ");
                    words.remove(word);
                    break;
                }
            }
        }

        return result.toString();
    }
}


