package ru.mirea.lab6.task12;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderWithUndo {
    private final StringBuilder stringBuilder;
    private final List<Command> commandHistory;

    private List<Observer> observers;

    public StringBuilderWithUndo() {
        this.stringBuilder = new StringBuilder();
        this.commandHistory = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void append(String str) {
        stringBuilder.append(str);
        commandHistory.add(new AppendCommand(str));
        for(Observer observer : this.observers) {
            observer.addInfo(new AppendCommand(str));
        }
    }

    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        stringBuilder.delete(start, end);
        commandHistory.add(new DeleteCommand(start, deleted));
        for(Observer observer : this.observers) {
            observer.addInfo(new DeleteCommand(start, deleted));
        }
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }

    private class AppendCommand implements Command {
        private final String appended;

        public AppendCommand(String appended) {
            this.appended = appended;
        }

        public void undo() {
            stringBuilder.delete(stringBuilder.length() - appended.length(), stringBuilder.length());
        }
    }

    private class DeleteCommand implements Command {
        private final int start;
        private final String deleted;

        public DeleteCommand(int start, String deleted) {
            this.start = start;
            this.deleted = deleted;
        }

        public void undo() {
            stringBuilder.insert(start, deleted);
        }
    }

    public static void main(String[] args) {
        Observer observer = new Observer();
        StringBuilderWithUndo stringBuilderWithUndo = new StringBuilderWithUndo();
        stringBuilderWithUndo.observers.add(observer);
        stringBuilderWithUndo.append("Hello");
        System.out.println(stringBuilderWithUndo.toString());
        stringBuilderWithUndo.undo();
        System.out.println(stringBuilderWithUndo.toString());


        stringBuilderWithUndo.append("World");
        System.out.println(stringBuilderWithUndo.toString());
        stringBuilderWithUndo.delete(0, 3);
        System.out.println(stringBuilderWithUndo.toString());
        stringBuilderWithUndo.undo();
        System.out.println(stringBuilderWithUndo.toString()); // Output: World
        System.out.println();
        observer.getInfo();
    }
}
