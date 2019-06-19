package by.epam.javatraining.kotkovets.maintask01.model.vector;

import by.epam.javatraining.kotkovets.maintask01.model.MyVector;
import by.epam.javatraining.kotkovets.maintask01.model.logic.vector.VectorLogic;
import org.junit.Test;

import static org.junit.Assert.*;


public class VectorLogicTest {

    @Test
    public void testFindMax() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, 4, 7, 3);
        double expected = 9;
        assertEquals(expected, VectorLogic.findMaxValue(vector), 0.1);
    }

    @Test
    public void testFindMaxZero() {
        MyVector vector = new MyVector(5);
        double expected = Double.MIN_VALUE;
        assertEquals(expected, VectorLogic.findMinValue(vector), 0.1);
    }

    @Test
    public void testFindMaxNull() {
        MyVector vector = null;
        double expected = Double.MIN_VALUE;
        assertEquals(expected, VectorLogic.findMaxValue(vector), 0.1);
    }

    @Test
    public void testFindMin() {
        MyVector vector = new MyVector(5);
        vector.add(7, 9, 3, -4, 7, 0);
        double expected = -4;
        assertEquals(expected, VectorLogic.findMinValue(vector), 0.1);
    }

    @Test
    public void testFindMinZero() {
        MyVector vector = new MyVector(5);
        double expected = Double.MAX_VALUE;
        assertEquals(expected, VectorLogic.findMinValue(vector), 0.1);
    }

    @Test
    public void testFindMinNull() {
        MyVector vector = null;
        double expected = Double.MAX_VALUE;
        assertEquals(expected, VectorLogic.findMinValue(vector), 0.1);
    }

    @Test
    public void testCalcArithmeticAverage() {
        MyVector vector = new MyVector();
        vector.add(5, 12, 6, 1);
        double expected = 6;
        assertEquals(expected, VectorLogic.findArithmeticAverage(vector), 0.1);
    }

    @Test
    public void testCalcArithmeticAverageZero() {
        MyVector vector = new MyVector();
        double expected = Double.NaN;
        assertEquals(expected, VectorLogic.findArithmeticAverage(vector), 0.1);
    }

    @Test
    public void testCalcArithmeticAverageNull() {
        MyVector vector = null;
        double expected = Double.NaN;
        assertEquals(expected, VectorLogic.findArithmeticAverage(vector), 0.1);
    }

    @Test
    public void testCalcGeometricAverage() {
        MyVector vector = new MyVector();
        vector.add(5, 25, 5, 1);
        double expected = 5;
        assertEquals(expected, VectorLogic.findGeometricAverage(vector), 0.1);
    }

    @Test
    public void testCalcGeometricAverageZero() {
        MyVector vector = new MyVector();
        double expected = Double.NaN;
        assertEquals(expected, VectorLogic.findGeometricAverage(vector), 0.1);
    }

    @Test
    public void testCalcGeometricAverageNull() {
        MyVector vector = null;
        double expected = Double.NaN;
        assertEquals(expected, VectorLogic.findGeometricAverage(vector), 0.1);
    }

    @Test
    public void testIsDecreasingDecrease() {
        MyVector vector = new MyVector();
        vector.add(56, 12, 8, 4, 3);
        boolean expected = true;
        assertEquals(expected, VectorLogic.isDecreasing(vector));
    }

    @Test
    public void testIsDecreasingIncrease() {
        MyVector vector = new MyVector();
        vector.add(1, 3, 4, 56, 78);
        boolean expected = false;
        assertEquals(expected, VectorLogic.isDecreasing(vector));
    }

    @Test
    public void testIsDecreasingNeither() {
        MyVector vector = new MyVector();
        vector.add(1, 56, 40, 5, 1);
        boolean expected = false;
        assertEquals(expected, VectorLogic.isDecreasing(vector));
    }

    @Test
    public void testIsDecreasingZero() {
        MyVector vector = new MyVector();
        boolean expected = false;
        assertEquals(expected, VectorLogic.isDecreasing(vector));
    }

    @Test
    public void testIsDecreasingNull() {
        MyVector vector = null;
        boolean expected = false;
        assertEquals(expected, VectorLogic.isDecreasing(vector));
    }

    @Test
    public void testIsIncreasingDecrease() {
        MyVector vector = new MyVector();
        vector.add(56, 12, 8, 4, 3);
        boolean expected = false;
        assertEquals(expected, VectorLogic.isIncreasing(vector));
    }

    @Test
    public void testIsIncreasingIncrease() {
        MyVector vector = new MyVector();
        vector.add(1, 3, 4, 56, 78);
        boolean expected = true;
        assertEquals(expected, VectorLogic.isIncreasing(vector));
    }

    @Test
    public void testIsIncreasingNeither() {
        MyVector vector = new MyVector();
        vector.add(1, 56, 40, 5, 1);
        double[] array = {1, 56, 40, 5, 1};
        boolean expected = false;
        assertEquals(expected, VectorLogic.isIncreasing(vector));
    }

    @Test
    public void testIsIncreasingZero() {
        MyVector vector = new MyVector();
        boolean expected = false;
        assertEquals(expected, VectorLogic.isIncreasing(vector));
    }

    @Test
    public void testIsIncreasingNull() {
        MyVector vector = null;
        boolean expected = false;
        assertEquals(expected, VectorLogic.isIncreasing(vector));
    }

    @Test
    public void testIsOrderedDecrease() {
        MyVector vector = new MyVector();
        vector.add(89, 45, 23, 12, 5);
        boolean expected = true;
        assertEquals(expected, VectorLogic.isOrdered(vector));
    }

    @Test
    public void testIsOrderedIncrease() {
        MyVector vector = new MyVector();
        vector.add(5, 6, 46, 78, 90);
        boolean expected = true;
        assertEquals(expected, VectorLogic.isOrdered(vector));
    }

    @Test
    public void testIsOrderedNeither() {
        MyVector vector = new MyVector();
        vector.add(54, 31, 87, 41, 654);
        boolean expected = false;
        assertEquals(expected, VectorLogic.isOrdered(vector));
    }

    @Test
    public void testIsOrderedZero() {
        MyVector vector = new MyVector();
        boolean expected = false;
        assertEquals(expected, VectorLogic.isOrdered(vector));
    }

    @Test
    public void testIsOrderedNull() {
        MyVector vector = new MyVector();
        boolean expected = false;
        assertEquals(expected, VectorLogic.isOrdered(vector));
    }

    @Test
    public void testFindFirstLocalMinPosition() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 2, 5, 1, 3);
        int expected = 2;
        assertEquals(expected, VectorLogic.findFirstLocalMinPosition(vector));
    }

    @Test
    public void testFindFirstLocalMinPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 9, 15);
        int expected = -1;
        assertEquals(expected, VectorLogic.findFirstLocalMinPosition(vector));
    }

    @Test
    public void testFindFirstLocalMinPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, VectorLogic.findFirstLocalMinPosition(vector));
    }

    @Test
    public void testFindFirstLocalMinPositionNull() {
        MyVector vector = null;
        int expected = -1;
        assertEquals(expected, VectorLogic.findFirstLocalMinPosition(vector));
    }

    @Test
    public void testFindLastLocalMinPosition() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 2, 5, 1, 3);
        int expected = 4;
        assertEquals(expected, VectorLogic.findLastLocalMinPosition(vector));
    }

    @Test
    public void testFindLastLocalMinPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 9, 15);
        int expected = -1;
        assertEquals(expected, VectorLogic.findLastLocalMinPosition(vector));
    }

    @Test
    public void testFindLastLocalMinPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, VectorLogic.findLastLocalMinPosition(vector));
    }

    @Test
    public void testFindLastLocalMinPositionNull() {
        MyVector vector = null;
        int expected = -1;
        assertEquals(expected, VectorLogic.findLastLocalMinPosition(vector));
    }

    @Test
    public void testFindFirstLocalMaxPosition() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 22, 3, 78, 5);
        int expected = 2;
        assertEquals(expected, VectorLogic.findFirstLocalMaxPosition(vector));
    }

    @Test
    public void testFindFirstLocalMaxPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 8, 2);
        int expected = -1;
        assertEquals(expected, VectorLogic.findFirstLocalMaxPosition(vector));
    }

    @Test
    public void testFindFirstLocalMaxPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, VectorLogic.findFirstLocalMaxPosition(vector));
    }

    @Test
    public void testFindFirstLocalMaxPositionNull() {
        MyVector vector = null;
        int expected = -1;
        assertEquals(expected, VectorLogic.findFirstLocalMaxPosition(vector));
    }

    @Test
    public void testFindLastLocalMaxPositionInner() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 22, 3, 78, 5);
        int expected = 4;
        assertEquals(expected, VectorLogic.findLastLocalMaxPosition(vector));
    }

    @Test
    public void testFindLastLocalMaxPositionNeither() {
        MyVector vector = new MyVector();
        vector.add(7, 7, 7, 8, 8, 2);
        int expected = -1;
        assertEquals(expected, VectorLogic.findLastLocalMaxPosition(vector));
    }

    @Test
    public void testFindLastLocalMaxPositionZero() {
        MyVector vector = new MyVector();
        int expected = -1;
        assertEquals(expected, VectorLogic.findLastLocalMaxPosition(vector));
    }

    @Test
    public void testFindLastLocalMaxPositionNull() {
        MyVector vector = null;
        int expected = -1;
        assertEquals(expected, VectorLogic.findLastLocalMaxPosition(vector));
    }

    @Test
    public void testReverseOdd() {
        MyVector vector = new MyVector();
        vector.add(546, 8, 13, 6, 4, 3125, 9, 4, 31, 4, 645);
        VectorLogic.reverse(vector);
        MyVector expected = new MyVector();
        expected.add(645, 4, 31, 4, 9, 3125, 4, 6, 13, 8, 546);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testReverseEven() {
        MyVector vector = new MyVector();
        vector.add(546, 8, 13, 6, 4, 3125, 9, 4, 31, 4, 645, 14);
        VectorLogic.reverse(vector);
        MyVector expected = new MyVector();
        expected.add(14, 645, 4, 31, 4, 9, 3125, 4, 6, 13, 8, 546);
        assertTrue(vector.equals(expected));
    }

    @Test
    public void testReverseZero() {
        MyVector vector = new MyVector();
        VectorLogic.reverse(vector);
        MyVector expected = new MyVector();
        assertTrue(vector.equals(expected));
    }
}