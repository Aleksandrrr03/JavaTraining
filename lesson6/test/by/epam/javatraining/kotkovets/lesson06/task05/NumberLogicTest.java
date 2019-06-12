package by.epam.javatraining.kotkovets.lesson06.task05;

import by.epam.javatraining.kotkovets.lesson06.task05.model.logic.NumberLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberLogicTest {

    @Test
    public void isSimple(){
        int number = 11;
        boolean expResult = true;
        assertEquals(expResult,NumberLogic.isSimple(number));
    }

    @Test
    public void isSimpleZero(){
        int number = 0;
        boolean expResult = false;
        assertEquals(expResult,NumberLogic.isSimple(number));
    }

    @Test
    public void isSimpleNot(){
        int number = 4;
        boolean expResult = false;
        assertEquals(expResult,NumberLogic.isSimple(number));
    }

    @Test
    public void isSimpleNegative(){
        int number = -4;
        boolean expResult = false;
        assertEquals(expResult,NumberLogic.isSimple(number));
    }

}
