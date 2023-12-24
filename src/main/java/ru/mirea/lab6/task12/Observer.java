package ru.mirea.lab6.task12;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    public List<Command> commandHistory;

    public Observer() {
        this.commandHistory = new ArrayList<>();
    }

    public void getInfo() {
        for(Command command : this.commandHistory) {
            System.out.println(command);
        }
    }

    public void addInfo(Command command) {
        this.commandHistory.add(command);
    }
}
