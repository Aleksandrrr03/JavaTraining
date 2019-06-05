package by.epam.javatraining.kotkovets.lesson5.task02.model.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterCheckerTest {

    @Test
    public void testIsVowelOne() {
        char character = 'w';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelOne(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelOneLower() {
        char character = 'a';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelOne(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelTwo() {
        char character = 'r';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelTwo(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelTwoLower() {
        char character = 'i';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelTwo(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelThree() {
        char character = 'p';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelThree(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelThreeLower() {
        char character = 'y';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelThree(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelFour() {
        char character = 'n';
        boolean expResult = false;
        boolean result = CharacterChecker.isVowelFour(character);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsVowelFourLower() {
        char character = 'o';
        boolean expResult = true;
        boolean result = CharacterChecker.isVowelFour(character);
        assertEquals(expResult, result);
    }

}
