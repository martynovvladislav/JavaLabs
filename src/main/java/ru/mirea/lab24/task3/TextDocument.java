package ru.mirea.lab24.task3;

public class TextDocument implements IDocument {
    private String content;

    public TextDocument(String content) {
        this.content = content;
    }

    public TextDocument() {
        this.content = "";
    }

    public void open(String filePath) {
        // Логика открытия текстового файла
    }

    public void save(String filePath) {
        // Логика сохранения текстового файла
    }

    public void setContent(String content) {
        this.content = content;
    }
}
