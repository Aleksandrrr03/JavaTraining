package by.epam.javatraining.kotkovets.lesson06.task04;

import by.epam.javatraining.kotkovets.lesson06.task04.model.logic.NumberLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberLogicTest {

    @Test
    public void testIsSameParityEven(){
        int number  = 246;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isSameParity(number));
    }

    @Test
    public void testIsSameParityEvenNegative(){
        int number  = -246;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isSameParity(number));
    }

    @Test
    public void testIsSameParityEvenNot(){
        int number  = 12;
        boolean expResult= false;
        assertEquals(expResult, NumberLogic.isSameParity(number));
    }

    @Test
    public void testIsSameParityEvenNotNegative(){
        int number  = -12;
        boolean expResult= false;
        assertEquals(expResult, NumberLogic.isSameParity(number));
    }


    @Test
    public void testIsSameParityOdd(){
        int number  = 135;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isSameParity(number));
    }

    @Test
    public void testIsSameParityOddNegative(){
        int number  = -135;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isSameParity(number));
    }

    @Test
    public void testIsParityEven(){
        int number  = 246;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isEvenParity(number));
    }

    @Test
    public void testIsParityEvenZero(){
        int number  = 0;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isEvenParity(number));
    }

    @Test
    public void testIsParityEvenNot(){
        int number  = 12;
        boolean expResult= false;
        assertEquals(expResult, NumberLogic.isEvenParity(number));
    }

    @Test
    public void testIsParityEvenNegative(){
        int number  = -246;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isEvenParity(number));
    }

    @Test
    public void testIsParityOdd(){
        int number  = 137;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isParityOdd(number));
    }
    @Test
    public void testIsParityOddNot(){
        int number  = 12;
        boolean expResult= false;
        assertEquals(expResult, NumberLogic.isParityOdd(number));
    }

    @Test
    public void testIsParityOddNegative(){
        int number  = -137;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isParityOdd(number));
    }

    @Test
    public void testIsParityOddZero(){
        int number  = 0;
        boolean expResult= true;
        assertEquals(expResult, NumberLogic.isParityOdd(number));
    }


}
