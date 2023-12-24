package ru.mirea.project2.generators;

import ru.mirea.project2.maze.Maze;
import java.util.Random;

public interface MazeGenerator {
    Random RANDOMIZER = new Random();

    Maze generate(int height, int width);
}
