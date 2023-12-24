package ru.mirea.lab20;

public class Matrix<T extends Number> {
    private T[][] matrix;
    private int rows;
    private int columns;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for addition");
        }

        T[][] result = newArray(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = addElements(matrix[i][j], other.matrix[i][j]);
            }
        }

        return new Matrix<>(result);
    }

    private T addElements(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    // Умножение матриц
    public Matrix<T> multiply(Matrix<T> other) {
        if (columns != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication");
        }

        T[][] result = newArray(rows, other.columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                result[i][j] = multiplyElement(i, j, other);
            }
        }

        return new Matrix<>(result);
    }

    // Вспомогательный метод для умножения элемента матрицы
    private T multiplyElement(int row, int col, Matrix<T> other) {
        T sum = (T) Integer.valueOf(0);

        for (int k = 0; k < columns; k++) {
            sum = addElements(sum, multiplyElements(matrix[row][k], other.matrix[k][col]));
        }

        return sum;
    }

    private T multiplyElements(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }


    private T[][] newArray(int rows, int columns) {
        return (T[][]) new Number[rows][columns];
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2}, {3, 4}};
        Integer[][] data2 = {{1, 2}, {3, 4}};

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        System.out.println("Matrix 1:");
        matrix1.printMatrix();

        System.out.println("\nMatrix 2:");
        matrix2.printMatrix();

        System.out.println("\nMatrix 1 + Matrix 2:");
        Matrix<Integer> sumResult = matrix1.add(matrix2);
        sumResult.printMatrix();

        System.out.println("\nMatrix 1 * Matrix 2:");
        Matrix<Integer> multiplyResult = matrix1.multiply(matrix2);
        multiplyResult.printMatrix();
    }
}
