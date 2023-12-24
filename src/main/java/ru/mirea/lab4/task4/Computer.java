package ru.mirea.lab4.task4;

public class Computer {
    Processor processor;
    Memory memory;
    Monitor monitor;
    ComputerNames name;
    Computer(Processor processor, Memory memory, Monitor monitor, ComputerNames name) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.name = name;
    }

    public void launchPC() {
        System.out.println("PC launched!");
    }

    public ComputerNames getName() {
        return name;
    }

    public static void main(String[] args) {
        Processor processor = new Processor(1000, 64);
        System.out.println("Базовая частота процессора: " + processor.getClockspeed());
        processor.overclock();
        System.out.println("Новая частота процессора: " + processor.getClockspeed());
        Memory memory = new Memory(1000, 16);
        System.out.println("\nБазовая частота ОЗУ: " + memory.getClockspeed());
        memory.overclock();
        System.out.println("Новая частота ОЗУ: " + memory.getClockspeed());
        Monitor monitor = new Monitor(16, 144);
        System.out.println();
        monitor.turnOn();
        Computer computer = new Computer(processor, memory, monitor, ComputerNames.HP);
        System.out.println("Модель компьютера: " + computer.getName());
        computer.launchPC();
    }
}
