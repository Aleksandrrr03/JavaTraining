package by.epam.javatraining.kotkovets.lesson06.task01;

import by.epam.javatraining.kotkovets.lesson06.task01.model.logic.HeadOrTail;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadOrTailTest {

    @Test
    public void testCheakHeadsOrTails(){
        int steps = -12;
        String expResult = "Invalid data!";
        assertEquals(expResult,HeadOrTail.cheakHeadsOrTails(steps));
    }

}
