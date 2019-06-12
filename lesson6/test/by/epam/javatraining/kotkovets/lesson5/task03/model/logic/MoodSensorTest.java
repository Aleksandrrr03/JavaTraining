package by.epam.javatraining.kotkovets.lesson5.task03.model.logic;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodSensorTest {


    @Test
    public void testWrapMethodGoodMood() {
        int moodNumber = 0;
        String expResult = ":’-)";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodBadMood() {
        int moodNumber = 1;
        String expResult = ":’-(";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodSurpriseMood() {
        int moodNumber = 2;
        String expResult = "*_*";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodSadMood() {
        int moodNumber = 3;
        String expResult = ":-<";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodCalmMood() {
        int moodNumber = 4;
        String expResult = ":-|";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }

    @Test
    public void testWrapMethodAnxiousMood() {
        int moodNumber = 5;
        String expResult = "*#*";
        String result = MoodSensor.wrapMethod(moodNumber);
        assertEquals(expResult, result);
    }


}
