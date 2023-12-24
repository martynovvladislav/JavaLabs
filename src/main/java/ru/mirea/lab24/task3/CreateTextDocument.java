package ru.mirea.lab24.task3;

public class CreateTextDocument implements ICreateDocument {
    public IDocument createNew() {
        return new TextDocument();
    }

    public IDocument createOpen(String filePath) {
        TextDocument textDocument = new TextDocument();
        textDocument.open(filePath);
        return textDocument;
    }
}
