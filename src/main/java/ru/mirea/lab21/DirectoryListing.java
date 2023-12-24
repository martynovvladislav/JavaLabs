package ru.mirea.lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryListing {

    public static List<String> listFilesInDirectory(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (int i = 0; i < Math.min(5, files.length); i++) {
                    fileList.add(files[i].getName());
                }
            }
        }

        return fileList;
    }

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\marty\\IdeaProjects\\JavaLab21\\src\\main\\java";
        List<String> fileList = listFilesInDirectory(directoryPath);

        System.out.println("First 5 elements:");
        for (int i = 0; i < Math.min(5, fileList.size()); i++) {
            System.out.println(fileList.get(i));
        }
    }
}
