package ru.mirea.project2;

import ru.mirea.project2.generators.BinaryTreeGenerator;
import ru.mirea.project2.generators.KruskalGenerator;
import ru.mirea.project2.generators.MazeGenerator;
import ru.mirea.project2.maze.Coordinate;
import ru.mirea.project2.maze.Maze;
import ru.mirea.project2.renderers.MazeRenderer;
import ru.mirea.project2.solvers.BFSSolver;
import ru.mirea.project2.solvers.DFSSolver;

public class Controller {
    private Controller() {}
    private static final int MAZE_HEIGHT = 15;
    private static final int MAZE_WIDTH = 70;

    public static void run() {
        MazeGenerator binaryTreeGenerator = new BinaryTreeGenerator();
        MazeGenerator kruskalGenerator = new KruskalGenerator();
        System.out.println("BINARY TREE MAZE:");
        demonstrateMaze(binaryTreeGenerator.generate(MAZE_HEIGHT, MAZE_WIDTH));
        System.out.println("KRUSKAL'S MAZE:");
        demonstrateMaze(kruskalGenerator.generate(MAZE_HEIGHT, MAZE_WIDTH));
    }

    private static void demonstrateMaze(Maze maze) {
        MazeRenderer renderer = new MazeRenderer();
        System.out.println(renderer.render(maze));

        System.out.println("BFS SOLUTION:");
        System.out.println(renderer.render(
            maze, new BFSSolver().solve(maze, new Coordinate(0, 0), new Coordinate(MAZE_HEIGHT - 1, MAZE_WIDTH - 1)))
        );

        System.out.println("DFS SOLUTION:");
        System.out.println(renderer.render(
            maze, new DFSSolver().solve(maze, new Coordinate(0, 0), new Coordinate(MAZE_HEIGHT - 1, MAZE_WIDTH - 1)))
        );
    }
}
