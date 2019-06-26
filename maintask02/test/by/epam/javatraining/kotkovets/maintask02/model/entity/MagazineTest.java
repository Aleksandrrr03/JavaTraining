package by.epam.javatraining.kotkovets.maintask02.model.entity;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Magazine;
import static org.junit.Assert.*;
import org.junit.Test;

public class MagazineTest {

    @Test
    public void testSetPageBinding(){
        Magazine magazine = new Magazine();
        magazine.setPageBinding("Standard");
        String expected = "Standard";
        assertEquals(expected,magazine.getPageBinding());
    }


    @Test
    public void testSetPageBindingNull(){
        Magazine magazine = new Magazine();
        magazine.setPageBinding(null);
        String expected = " ";
        assertEquals(expected,magazine.getPageBinding());
    }

    @Test
    public void testSetPeriodicity(){
        Magazine magazine = new Magazine();
        magazine.setPeriodicity("Often");
        String expected = "Often";
        assertEquals(expected,magazine.getPeriodicity());
    }

    @Test
    public void testSetPeriodicityNull(){
        Magazine magazine = new Magazine();
        magazine.setPeriodicity(null);
        String expected = " ";
        assertEquals(expected,magazine.getPeriodicity());
    }

    @Test
    public void testEqualsTrue(){
        Magazine firstMagazine = new Magazine();
        Magazine secondMagazine = new Magazine();
        boolean expected = true;
        assertEquals(expected,firstMagazine.equals(secondMagazine));
    }

    @Test
    public void testEqualsFalse(){
        Magazine firstMagazine = new Magazine();
        Magazine secondMagazine = new Magazine();
        secondMagazine.setPeriodicity("Often");
        boolean expected = false;
        assertEquals(expected,firstMagazine.equals(secondMagazine));
    }
}
