import java.util.Arrays;

public class MatrixOperations {

    static int[] rowSums(int[][] matrix) {
        int[] result = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i] += matrix[i][j];
            }
        }

        return result;
    }

    static int[] columnSums(int[][] matrix) {
        int columns = matrix.length == 0 ? 0 : matrix[0].length;
        int[] result = new int[columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < columns; j++) {
                result[j] += matrix[i][j];
            }
        }

        return result;
    }

    static int[][] add(int[][] first, int[][] second) {
        validateSameDimensions(first, second);

        int[][] result = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        return result;
    }

    static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {
        if (first[0].length != second.length) {
            throw new IllegalArgumentException(
                    "First matrix columns must equal second matrix rows.");
        }

        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < second.length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void validateSameDimensions(int[][] first, int[][] second) {
        if (first.length != second.length
                || first[0].length != second[0].length) {
            throw new IllegalArgumentException(
                    "Matrices must have the same dimensions.");
        }
    }

    public static void main(String[] args) {
        int[][] first = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] second = {
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] third = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        System.out.println("Row sums: " + Arrays.toString(rowSums(first)));
        System.out.println("Column sums: " + Arrays.toString(columnSums(first)));
        System.out.println("Addition:");
        printMatrix(add(first, second));
        System.out.println("Transpose:");
        printMatrix(transpose(first));
        System.out.println("Multiplication:");
        printMatrix(multiply(first, third));
    }
}
