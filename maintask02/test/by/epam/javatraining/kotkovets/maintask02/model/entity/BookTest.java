package by.epam.javatraining.kotkovets.maintask02.model.entity;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Book;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testSetCover(){
        Book book = new Book();
        book.setCover("Leather");
        String expected = "Leather";
        assertEquals(expected,book.getCover());
    }


    @Test
    public void testSetColorPage(){
        Book book = new Book();
        book.setColorsPage("Blue");
        String expected = "Blue";
        assertEquals(expected,book.getColorsPage());
    }

    @Test
    public void testEqualsTrue(){
        Book firstBook = new Book();
        Book secondBook = new Book();
        boolean expected = true;
        assertEquals(expected,firstBook.equals(secondBook));
    }

    @Test
    public void testEqualsFalse(){
        Book firstBook = new Book();
        Book secondBook = new Book();
        secondBook.setColorsPage("Blue");
        boolean expected = false;
        assertEquals(expected,firstBook.equals(secondBook));
    }

}
