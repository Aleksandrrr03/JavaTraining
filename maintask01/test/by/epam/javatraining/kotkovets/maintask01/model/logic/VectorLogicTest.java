package by.epam.javatraining.kotkovets.maintask01.model.logic;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * This class contains unit-tests for check class VectorLogic.
 *
 * @author Kotkovets Aleksandr Sergeevich
 * @version 1.0.0
 */

public class VectorLogicTest {

    @Test
    public void testFindMaxValue() {
        double[] vector = {1.2, 0.3, 0.9, 6.3, 74, 20.5};
        double expResult = 74;
        assertEquals(expResult, VectorLogic.findMaxValue(vector), 0.1);
    }

    @Test
    public void testFindMinValue() {
        double[] vector = {1.2, 0.3, 0.9, 6.3, 74, 20.5};
        double expResult = 0.3;
        assertEquals(expResult, VectorLogic.findMinValue(vector), 0.1);
    }


    @Test
    public void testFindGeometricAverage() {
        double[] vector = {1.2, 0.3, 0.9, 6.3, 74, 20.5};
        double expResult = 3.9355798748973245;
        assertEquals(expResult, VectorLogic.findGeometricAverage(vector), 0.1);
    }

    @Test
    public void testFindGeometricAverageZero() {
        double[] vector = {};
        double expResult = 0;
        assertEquals(expResult, VectorLogic.findGeometricAverage(vector), 0.1);
    }

    @Test
    public void testFindArithmeticAverage() {
        double[] vector = {1.2, 0.3, 0.9, 6.3, 74, 20.5};
        double expResult = 17.400000000000002;
        assertEquals(expResult, VectorLogic.findArithmeticAverage(vector), 0.1);
    }

    @Test
    public void testFindArithmeticAverageZero() {
        double[] vector = {};
        double expResult = 0;
        assertEquals(expResult, VectorLogic.findArithmeticAverage(vector), 0.1);
    }


    @Test
    public void testIsSortedIncreasingNot() {
        double[] vector = {1.2, 0.3, 0.9, 6.3, 74, 20.5};
        boolean expResult = false;
        assertEquals(expResult, VectorLogic.isSortedIncreasing(vector));
    }

    @Test
    public void testIsSortedIncreasing() {
        double[] vector = {1, 3, 9, 63, 74};
        boolean expResult = true;
        assertEquals(expResult, VectorLogic.isSortedIncreasing(vector));
    }

    @Test
    public void testIsSortedIncreasingZero() {
        double[] vector = {};
        boolean expResult = false;
        assertEquals(expResult, VectorLogic.isSortedIncreasing(vector));
    }

    @Test
    public void testIsSortedDecreasingNot() {
        double[] vector = {1.2, 0.3, 0.9, 6.3, 74, 20.5};
        boolean expResult = false;
        assertEquals(expResult, VectorLogic.isSortedDecreasing(vector));
    }

    @Test
    public void testIsSortedDecreasing() {
        double[] vector = {74, 7, 6, 5};
        boolean expResult = true;
        assertEquals(expResult, VectorLogic.isSortedDecreasing(vector));
    }

    @Test
    public void testIsSortedDecreasingZero() {
        double[] vector = {};
        boolean expResult = false;
        assertEquals(expResult, VectorLogic.isSortedDecreasing(vector));
    }

    @Test
    public void testIsOrderedZero() {
        double[] vector = {};
        boolean expResult = false;
        assertEquals(expResult, VectorLogic.isOrdered(vector));
    }

    @Test
    public void testIsOrdered() {
        double[] vector = {74, 7, 6, 5};
        boolean expResult = true;
        assertEquals(expResult, VectorLogic.isOrdered(vector));
    }

    @Test
    public void testFindLocalMinPositionZero() {
        double[] vector = {};
        int expResult = -1;
        assertEquals(expResult, VectorLogic.findLocalMinPosition(vector));
    }

    @Test
    public void testFindLocalMinPositionNotAvailable() {
        double[] vector = {74, 7, 6, 5};
        int expResult = -1;
        assertEquals(expResult, VectorLogic.findLocalMinPosition(vector));
    }

    @Test
    public void testFindLocalMinPosition() {
        double[] vector = {74, 7, 6, 8};
        int expResult = 2;
        assertEquals(expResult, VectorLogic.findLocalMinPosition(vector));
    }

    @Test
    public void testFindLocalMaxPositionZero() {
        double[] vector = {};
        int expResult = -1;
        assertEquals(expResult, VectorLogic.findLocalMaxPosition(vector));
    }

    @Test
    public void testFindLocalMaxPositionNotAvailable() {
        double[] vector = {74, 7, 6, 5};
        int expResult = -1;
        assertEquals(expResult, VectorLogic.findLocalMaxPosition(vector));
    }

    @Test
    public void testFindLocalMaxPosition() {
        double[] vector = {74, 7, 9, 8};
        int expResult = 2;
        assertEquals(expResult, VectorLogic.findLocalMaxPosition(vector));
    }

    @Test
    public void testSearchLinearFirstPositionZero() {
        double[] vector = {};
        double key = 4;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchLinearFirstPosition(vector, key));
    }

    @Test
    public void testSearchLinearFirstPositionNotAvailable() {
        double[] vector = {74, 7, 6, 5};
        double key = 8;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchLinearFirstPosition(vector, key));
    }

    @Test
    public void testSearchLinearFirstPosition() {
        double[] vector = {74, 7, 9, 8, 7};
        double key = 7;
        int expResult = 1;
        assertEquals(expResult, VectorLogic.searchLinearFirstPosition(vector, key));
    }

    @Test
    public void testSearchLinearLastPositionZero() {
        double[] vector = {};
        double key = 4;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchLinearLastPosition(vector, key));
    }

    @Test
    public void testSearchLinearLastPositionNotAvailable() {
        double[] vector = {74, 7, 6, 5};
        double key = 8;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchLinearLastPosition(vector, key));
    }

    @Test
    public void testSearchLinearLastPosition() {
        double[] vector = {74, 7, 9, 8, 7};
        double key = 7;
        int expResult = 4;
        assertEquals(expResult, VectorLogic.searchLinearLastPosition(vector, key));
    }

    @Test
    public void testSearchBinaryFirstNotSortedVector() {
        double[] vector = {74, 7, 9, 8, 7};
        double key = 7;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchBinaryFirst(vector, key));
    }

    @Test
    public void testSearchBinaryFirstNotAvailable() {
        double[] vector = {74, 7, 9, 8, 7};
        double key = 10;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchBinaryFirst(vector, key));
    }

    @Test
    public void testSearchBinaryFirst() {
        double[] vector = {7, 7, 8, 10, 17};
        double key = 8;
        int expResult = 1;
        assertEquals(expResult, VectorLogic.searchBinaryFirst(vector, key));
    }

    @Test
    public void testSearchBinaryLastNotSortedVector() {
        double[] vector = {74, 7, 9, 8, 7};
        double key = 7;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchBinaryLast(vector, key));
    }

    @Test
    public void testSearchBinaryLastNotAvailable() {
        double[] vector = {74, 7, 9, 8, 7};
        double key = 10;
        int expResult = -1;
        assertEquals(expResult, VectorLogic.searchBinaryLast(vector, key));
    }

    @Test
    public void testSearchBinaryLast() {
        double[] vector = {7, 7, 8, 10, 17};
        double key = 7;
        int expResult = 2;
        assertEquals(expResult, VectorLogic.searchBinaryLast(vector, key));
    }

    @Test
    public void testReverseVector() {
        double[] vector = {5, 6, 4, 8, 1};
        double[] expVector = {1, 8, 4, 6, 5};
        assertEquals(Arrays.hashCode(expVector), Arrays.hashCode(VectorLogic.reverseVector(vector)));
        // assertArrayEquals(expVector,vector,0.1);
    }

    @Test
    public void testReverseVectorZero() {
        double[] vector = {};
        String expResult = null;
        assertNull((expResult), (VectorLogic.reverseVector(vector)));
    }

    @Test
    public void testSortBubbleIncrease() {
        double[] vector = {5, 6, 4, 8, 1};
        double[] expVector = {1, 4, 5, 6, 8};
        VectorLogic.sortBubbleIncrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSortBubbleDecrease() {
        double[] vector = {5, 6, 4, 8, 1};
        double[] expVector = {8, 6, 5, 4, 1};
        VectorLogic.sortBubbleDecrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSortBubbleDecreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortBubbleDecrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSortInsertionIncrease() {
        double[] array = {5, 8, 40, 9, 38};
        double[] expVector = {5, 8, 9, 38, 40};
        VectorLogic.sortInsertionIncrease(array);
        assertArrayEquals(expVector, array, 0.1);
    }

    @Test
    public void testSortInsertionIncreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortInsertionIncrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSortInsertionDecrease() {
        double[] array = {5, 8, 40, 9, 38};
        double[] expVector = {40, 38, 9, 8, 5};
        VectorLogic.sortInsertionDecrease(array);
        assertArrayEquals(expVector, array, 0.1);
    }

    @Test
    public void testSortInsertionDecreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortInsertionDecrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSortSelectionIncrease() {
        double[] array = {5, 8, 40, 9, 38};
        double[] expVector = {5, 8, 9, 38, 40};
        VectorLogic.sortSelectionIncrease(array);
        assertArrayEquals(expVector, array, 0.1);
    }

    @Test
    public void testSortSelectionIncreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortSelectionIncrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSortMergeDecrease() {
        double[] array = {5, 8, 40, 9, 38};
        double[] expVector = {40, 38, 9, 8, 5};
        VectorLogic.sortMergeDecrease(array);
        assertArrayEquals(expVector, array, 0.1);
    }

    @Test
    public void testSortMergeDecreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortMergeDecrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSortMergeIncrease() {
        double[] array = {5, 8, 40, 9, 38};
        double[] expVector = {5, 8, 9, 38, 40};
        VectorLogic.sortMergeIncrease(array);
        assertArrayEquals(expVector, array, 0.1);
    }

    @Test
    public void testSortMergeIncreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortMergeIncrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }


    @Test
    public void testSortQuickIncreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortQuickIncrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }


    @Test
    public void testSortQuickIncrease() {
        double[] vector = {5, 8, 40, 9, 38};
        double[] expVector = {5, 8, 9, 38, 40};
        VectorLogic.sortQuickIncrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }


    @Test
    public void testSortQuickDecrease() {
        double[] array = {5, 8, 40, 9, 38};
        double[] expVector = {40, 38, 9, 8, 5};
        VectorLogic.sortQuickDecrease(array);
        assertArrayEquals(expVector, array, 0.1);
    }

    @Test
    public void testSortQuickDecreaseZero() {
        double[] vector = {};
        double[] expVector = {};
        VectorLogic.sortQuickDecrease(vector);
        assertArrayEquals(expVector, vector, 0.1);
    }

    @Test
    public void testSwaping() {
        double[] vector = {1, 2};
        int firstIndex = 0;
        int secondIndex = 1;
        double[] expVector = {2,1};
        VectorLogic.swaping(vector,firstIndex,secondIndex);
        assertArrayEquals(expVector,vector,0.1);
    }
}
