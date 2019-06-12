package by.epam.javatraining.kotkovets.maintask01.model.logic;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * This class contains unit-tests for check class MatrixLogic.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0.0
 */


public class MatrixLogicTest {

    @Test
    public void testFindMaxValue() {
        double[][] matrix = {
                {1, 3, 6},
                {5, 7, 3}
        };
        double expValue = 7;
        assertEquals(expValue, MatrixLogic.findMaxValue(matrix), 0.1);
    }

    @Test
    public void testFindMaxValueZero() {
        double[][] matrix = {};
        double expValue = Double.MIN_VALUE;
        assertEquals(expValue, MatrixLogic.findMaxValue(matrix), 0.1);
    }

    @Test
    public void testFindMinValue() {
        double[][] matrix = {
                {1, 3, 6},
                {5, 7, 3}
        };
        double expValue = 1;
        assertEquals(expValue, MatrixLogic.findMinValue(matrix), 0.1);
    }

    @Test
    public void testFindMinValueZero() {
        double[][] matrix = {};
        double expValue = Double.MAX_VALUE;
        assertEquals(expValue, MatrixLogic.findMinValue(matrix), 0.1);
    }

    @Test
    public void testIsSquare() {
        double[][] matrix = {
                {1, 3, 6},
                {5, 7, 3},
                {1, 2, 5}
        };
        boolean expResult = true;
        assertEquals(expResult, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsSquareNot() {
        double[][] matrix = {
                {1, 3, 6},
                {5, 7, 3},
        };
        boolean expResult = false;
        assertEquals(expResult, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsSquareNull() {
        double[][] matrix = {{}, {}};
        boolean expResult = false;
        assertEquals(expResult, MatrixLogic.isSquare(matrix));
    }

    @Test
    public void testIsNullNot() {
        double[][] matrix = {{1}, {2, 3}};
        boolean expResult = false;
        assertEquals(expResult, MatrixLogic.isNullMatrix(matrix));
    }

    @Test
    public void testIsSymmetric() {
        double[][] matrix = {
                {1, 2, 3},
                {2, 1, 3},
                {3, 3, 1}};
        boolean expResult = true;
        assertEquals(expResult, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricNot() {
        double[][] matrix = {
                {8, 2, 3},
                {2, 1, 4},
                {7, 3, 1}};
        boolean expResult = false;
        assertEquals(expResult, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricNotSquare() {
        double[][] matrix = {
                {1, 2, 3},
                {3, 3, 1}};
        boolean expResult = false;
        assertEquals(expResult, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testIsSymmetricNull() {
        double[][] matrix = {{}, {}};
        boolean expResult = false;
        assertEquals(expResult, MatrixLogic.isSymmetric(matrix));
    }

    @Test
    public void testFindLocalMinPosition() {
        double[][] matrix = {
                {4, 2, 3},
                {3, 3, 1}};
        int[] expResult = {0, 1};
        assertArrayEquals(expResult, MatrixLogic.findLocalMinPosition(matrix));
    }

    @Test
    public void testFindLocalMinPositionNot() {
        double[][] matrix = {
                {1, 2, 3},
                {3, 3, 1}};
        int[] expResult = {-1, -1};
        assertArrayEquals(expResult, MatrixLogic.findLocalMinPosition(matrix));
    }

    @Test
    public void testTranspose() {
        double[][] matrix = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 3, 1}};
        double[][] expResult = {
                {1, 2, 3},
                {2, 4, 3},
                {3, 5, 1}
        };
        MatrixLogic.transpose(matrix);
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                assertEquals(expResult[i][j], matrix[i][j], 0.1);
            }
        }
    }

}
