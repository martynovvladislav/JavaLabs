package ru.mirea.lab24.task2;

public interface AbstractChairFactory {
    VictorianChair createVictorianChair();

    MagicChair createMagicChair();

    FunctionalChair createFunctionalChair();
}
