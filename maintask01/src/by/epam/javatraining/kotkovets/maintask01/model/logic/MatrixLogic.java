package by.epam.javatraining.kotkovets.maintask01.model.logic;

import org.apache.log4j.Logger;

/**
 * This class contains different method for work with matrix.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0.0  10 Jun 2019
 */

public class MatrixLogic {

    private static final Logger logger = Logger.getRootLogger();

    // This method check: is zero matrix
    public static boolean isZeroMatrix(double[][] matrix) {
        logger.info("Method: isZeroMatrix()");

        boolean result = false;
        if (matrix.length != 0) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i].length == 0) {
                    logger.warn("Zero length matrix");
                    result = true;
                    break;
                }
            }
            logger.info("Matrix length not null");
        } else {
            logger.warn("Zero length matrix");
            result = true;
        }
        return result;
    }

    // This method finds the maximum value in the matrix.
    public static double findMaxValue(double[][] matrix) {
        logger.info("Method: findMaxValue()");

        double maxValue = Double.MIN_VALUE;

        if (!isZeroMatrix(matrix)) {
            for (double[] i : matrix) {
                for (double j : i) {
                    if (maxValue < j) {
                        maxValue = j;
                    }
                }
            }
        }
        logger.info("Max value = " + maxValue);
        return maxValue;
    }

    //This method finds the minimum value in the matrix.
    public static double findMinValue(double[][] matrix) {
        logger.info("Method findMinValue()");

        double minValue = Double.MAX_VALUE;
        if (!isZeroMatrix(matrix)) {
            for (double[] i : matrix) {
                for (double j : i) {
                    if (minValue > j) {
                        minValue = j;
                    }
                }
            }
        }
        logger.info("Min value  = " + minValue);
        return minValue;
    }

    // This method checks: is the matrix square ?
    public static boolean isSquare(double[][] matrix) {
        logger.info("Method isSquareCheck()");
        if (!isZeroMatrix(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix.length != matrix[i].length) {
                    logger.info("Matrix is not square.");
                    return false;
                }
            }
            logger.info("Matrix is square.");
            return true;
        }
        logger.info("Matrix is not square.");
        return false;
    }

    // This method checks: is the matrix symmetric ?
    public static boolean isSymmetric(double[][] matrix) {
        logger.info("Method isSymmetric()");
        if (isSquare(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix.length - i; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        logger.info("Matrix  is not Symmetric()");
                        return false; // If not symmetric
                    }
                }
            }
            logger.info("Matrix  is Symmetric()");
            return true; // If symmetric;
        }
        logger.info("Matrix  is not Symmetric()");
        return false; // If not square, so not be symmetric
    }

    //This method finds position of the local minimum of matrix values
    public static int[] findLocalMinPosition(double[][] matrix) {
        logger.info("Method findLocalMinPosition()");

        if (!isZeroMatrix(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length - 1; j++) {
                    if (matrix[i][j - 1] > matrix[i][j] && matrix[i][j + 1] > matrix[i][j]) {
                        logger.info("Local minimum position:[" + i + "][" + j + ']');
                        return new int[]{i, j};
                    }
                }
            }
        }
        logger.info("Not local minimum");
        return new int[]{-1, -1};
    }

    public static void transpose(double[][] matrix) {
        logger.info("Method transpose()");

        if (!isZeroMatrix(matrix)) {
            for (int i = 0; i < matrix.length - 1; ++i) {
                for (int j = i + 1; j < matrix[0].length; ++j) {
                    matrix[i][j] += matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] -= matrix[j][i];
                }
            }
            logger.info("Transpose successful.");
        }
    }

}
