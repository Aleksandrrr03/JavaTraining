package by.epam.javatraining.kotkovets.lesson5.task01.model.logic;

import org.junit.Test;

import static by.epam.javatraining.kotkovets.lesson5.task01.model.logic.DragonLogic.*;
import static org.junit.Assert.*;

public class DragonLogicTest {

    @Test
    public void testCountHeadsNegative() {
        int age = -99;
        int expectedResult = 0;
        int result = countHeads(age);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountEyesNegative() {
        int age = -99;
        int expectedResult = 0;
        int result = countEyes(age);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountHeadsZero() {
        int age = 0;
        int expectedResult = 3;
        int result = countHeads(age);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountEyesZero() {
        int age = 0;
        int expectedResult = 6;
        int result = countEyes(age);
        assertEquals(expectedResult, result);
    }
//
    @Test
    public void testCountHeadsFirstAgeLimit() {
        int age = 100;
        int expectedResult = 303;
        int result = countHeads(age);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountEyesFirstAgeLimit() {
        int age = 100;
        int expectedResult = 606;
        int result = countEyes(age);
        assertEquals(expectedResult, result);
    }


    @Test
    public void testCountHeadsSecondAgeLimit() {
        int age = 252;
        int expectedResult = 707;
        int result = countHeads(age);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountEyesSecondAgeLimit() {
        int age = 252;
        int expectedResult = 1414;
        int result = countEyes(age);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountHeadsNoAgeLimit() {
        int age = 1100;
        int expectedResult = 1603;
        int result = countHeads(age);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCountEyesNoAgeLimit() {
        int age = 1100;
        int expectedResult = 3206;
        int result = countEyes(age);
        assertEquals(expectedResult, result);
    }
}
