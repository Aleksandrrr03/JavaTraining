package by.epam.javatraining.kotkovets.maintask01.model.logic;

/**
 * This class contains different method for work with matrix.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0.0
 */

public class MatrixLogic {

    // This method finds the maximum value in the matrix.
    public static double findMaxValue(double[][] matrix) {
        double maxValue = Double.MIN_VALUE;
        if (matrix.length != 0 && matrix[0].length != 0) {
            for (double[] i : matrix) {
                for (double j : i) {
                    if (maxValue < j) {
                        maxValue = j;
                    }
                }
            }
        }
        return maxValue;
    }

    //This method finds the minimum value in the matrix.
    public static double findMinValue(double[][] matrix) {
        double minValue = Double.MAX_VALUE;
        if (matrix.length != 0 && matrix[0].length != 0) {
            for (double[] i : matrix) {
                for (double j : i) {
                    if (minValue > j) {
                        minValue = j;
                    }
                }
            }
        }
        return minValue;
    }

    // This method checks: is the matrix square ?
    public static boolean isSquare(double[][] matrix) {
        return (!isNullMatrix(matrix)) && (matrix.length == matrix[0].length);
    }

    public static boolean isNullMatrix(double[][] matrix) {
        return matrix.length == 0 & matrix[0].length == 0;
    }

    // This method checks: is the matrix symmetric ?
    public static boolean isSymmetric(double[][] matrix) {
        if (isSquare(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix.length - i; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        return false; // If not symmetric
                    }
                }
            }
            return true; // If symmetric;
        }
        return false; // If not square, so not be symmetric
    }

    //This method finds position of the local minimum of matrix values
    public static int[] findLocalMinPosition(double[][] matrix) {
        if (!isNullMatrix(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length - 1; j++) {
                    if (matrix[i][j - 1] > matrix[i][j] && matrix[i][j + 1] > matrix[i][j]) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void transpose(double[][] matrix) {
        if (!isNullMatrix(matrix)) {
            for (int i = 0; i < matrix.length - 1; ++i) {
                for (int j = i + 1; j < matrix[0].length; ++j) {
                    matrix[i][j] += matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] -= matrix[j][i];
                }
            }
        }
    }

}
