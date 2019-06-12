package by.epam.javatraining.kotkovets.lesson06.task02;

import by.epam.javatraining.kotkovets.lesson06.task02.model.logic.NumberLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberLogicTest {

    @Test
    public void testIsDecreasingSequencePositiveNumber() {
        int number = 4321;
        boolean expResult = true;
        assertEquals(expResult,NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceNegativeNumber() {
        int number = -4321;
        boolean expResult = true;
        assertEquals(expResult,NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsDecreasingSequenceZero() {
        int number = 0;
        boolean expResult = false;
        assertEquals(expResult,NumberLogic.isDecreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequencePositiveNumber() {
        int number = 1235;
        boolean expResult = true;
        assertEquals(expResult,NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceNegativeNumber() {
        int number = -1356;
        boolean expResult = true;
        assertEquals(expResult,NumberLogic.isIncreasingSequence(number));
    }

    @Test
    public void testIsIncreasingSequenceZero() {
        int number = 0;
        boolean expResult = false;
        assertEquals(expResult,NumberLogic.isIncreasingSequence(number));
    }

}
