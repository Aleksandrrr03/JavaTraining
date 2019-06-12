package by.epam.javatraining.kotkovets.lesson06.task03;

import by.epam.javatraining.kotkovets.lesson06.task03.model.logic.NumberLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberLogicTest {


    @Test
    public void testFindFactorial() {
        int number = 5;
        int expResult = 120;
        assertEquals(expResult, NumberLogic.findFactorial(number));
    }

    @Test
    public void testFindFactorialOne() {
        int number = 1;
        int expResult = 1;
        assertEquals(expResult, NumberLogic.findFactorial(number));
    }

    @Test
    public void testFindFactorialZero() {
        int number = 0;
        int expResult = 1;
        assertEquals(expResult, NumberLogic.findFactorial(number));
    }

    @Test
    public void testFindFactorialNegative() {
        int number = -1;
        int expResult = -1;
        assertEquals(expResult, NumberLogic.findFactorial(number));
    }



}
