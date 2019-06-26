package by.epam.javatraining.kotkovets.maintask02.model.entity;

import by.epam.javatraining.kotkovets.maintask01.model.entity.Edition;

import static org.junit.Assert.*;
import org.junit.Test;

public class EditionTest {

    @Test
    public void testSetCountOfPage(){
        Edition edition = new Edition();
        edition.setCountOfPages(5);
        int expected = 5;
        assertEquals(expected,edition.getCountOfPages());
    }

    @Test
    public void testSetNumberOfEdition(){
        Edition edition = new Edition();
        edition.setNumberOfEdition(5);
        int expected = 5;
        assertEquals(expected,edition.getNumberOfEdition());
    }

    @Test
    public void testSetTitleOfEdition(){
        Edition edition = new Edition();
        edition.setTitleOfEdition("Edition");
        String expected = "Edition";
        assertEquals(expected,edition.getTitleOfEdition());
    }

    @Test
    public void testSetTitleOfEditionNull(){
        Edition edition = new Edition();
        edition.setTitleOfEdition(null);
        String expected = " ";
        assertEquals(expected,edition.getTitleOfEdition());
    }


    @Test
    public void testSetYearOfIssuesPositive(){
        Edition edition = new Edition();
        edition.setYearOfIssue(1236);
        int expected = 1236;
        assertEquals(expected,edition.getYearOfIssue());
    }

    @Test
    public void testSetYearOfIssuesNegative(){
        Edition edition = new Edition();
        edition.setYearOfIssue(-222);
        int expected = 0;
        assertEquals(expected,edition.getYearOfIssue());
    }

    @Test
    public void testSetYearOfIssuesZero(){
        Edition edition = new Edition();
        edition.setYearOfIssue(0);
        int expected = 0;
        assertEquals(expected,edition.getYearOfIssue());
    }

    @Test
    public void testSetAuthor(){
        Edition edition = new Edition();
        edition.setAuthor("Author");
        String expected = "Author";
        assertEquals(expected,edition.getAuthor());
    }

    @Test
    public void testSetAuthorZero(){
        Edition edition = new Edition();
        edition.setAuthor("");
        String expected = "";
        assertEquals(expected,edition.getAuthor());
    }

    @Test
    public void testSetAuthorNull(){
        Edition edition = new Edition();
        edition.setAuthor(null);
        String expected = " ";
        assertEquals(expected,edition.getAuthor());
    }

    @Test
    public void testSetCountOfEditionPositive(){
        Edition edition = new Edition();
        edition.setCountOfEdition(12);
        int expected = 12;
        assertEquals(expected,edition.getCountOfEdition());
    }

    @Test
    public void testSetCountOfEditionNegative(){
        Edition edition = new Edition();
        edition.setCountOfEdition(-12);
        int expected = 0;
        assertEquals(expected,edition.getCountOfEdition());
    }

    @Test
    public void testSetCountOfEditionZero(){
        Edition edition = new Edition();
        edition.setCountOfEdition(0);
        int expected = 0;
        assertEquals(expected,edition.getCountOfEdition());
    }

    @Test
    public void testSetType(){
        Edition edition = new Edition();
        edition.setType("Type");
        String expected = "Type";
        assertEquals(expected,edition.getType());
    }

    @Test
    public void testSetTypeNull(){
        Edition edition = new Edition();
        edition.setType(null);
        String expected = " ";
        assertEquals(expected,edition.getType());
    }

    @Test
    public void testEqualsTrue(){
        Edition firstEdition = new Edition();
        Edition secondEdition = new Edition();
        boolean expected = true;
        assertEquals(expected,firstEdition.equals(secondEdition));
    }

    @Test
    public void testEqualsFalse(){
        Edition firstEdition = new Edition();
        Edition secondEdition = new Edition();
        secondEdition.setType("Type");
        boolean expected = false;
        assertEquals(expected,firstEdition.equals(secondEdition));
    }
}
